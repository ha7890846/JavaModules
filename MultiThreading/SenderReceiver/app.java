//package MultiThreading.SenderReceiver;

import java.util.Scanner;

class Sms{
    String message;
    int reciepentCount= 0;
    int count = 0;
    synchronized public void writeSms(String text){
        System.out.println("Teacher Writing: " +text);
        while(count != 0){
            try {
                wait();
            } catch (Exception e) {}
        }
        message = text; 
        count = reciepentCount;
        notifyAll();
    }
    public void reciepent(){
        reciepentCount++;
        //System.out.println("reciepent count: "+ reciepentCount);
    }
   synchronized public String readMsg(){
        while(count == 0)
        {
            try {wait();} catch (Exception e) {}
        }
        String msg = message;
        count--;
        if(count == 0){
            notify();
        }
        return msg;
    }
}
class Sender extends Thread{
    Sms sms_obj;
    boolean choice= true;
    Scanner sc = new Scanner(System.in);
    public Sender(Sms sms){
        sms_obj = sms;
    }
    // public void run(){
    //     while(choice){
    //          System.out.print("Enter your message here: ");
    //          String text = sc.nextLine();
    //          sms_obj.writeSms(text);
    //         }
    // }
    
    public void run() {
        while (choice) {
            System.out.println("Enter your message here (type 'over' to exit): ");
            String text = sc.nextLine();
            if (text.equals("over")) {
                choice = false;
            } else {
                sms_obj.writeSms(text);
            }
        }
        sc.close();
    }
}
class Receiver extends Thread{
    Sms r_obj;
    String name;
    public Receiver(Sms obj, String name){
        r_obj = obj;
        this.name = name;
    }
    public void run(){
        String readMsg;
        //count total no of reciepent...
        r_obj.reciepent();
        do{
            readMsg = r_obj.readMsg();
            System.out.println(name+ " is reading : "+readMsg);
        }while(!readMsg.equals("over"));
    }
}

public class app {
    public static void main(String[] args) {
        Sms sms =  new Sms();
        Sender s = new Sender(sms);
        Receiver r = new Receiver(sms, "Kabir");
        Receiver r2 = new Receiver(sms, "Preeti");
        s.start();
        r.start();
        r2.start();
    }
}
