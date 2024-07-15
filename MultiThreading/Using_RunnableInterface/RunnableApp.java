
// Output will be Randomly JVM dependent..

class Super{
    public void show(){
        System.out.println("Super class show method");
    }
 }
class MyThread extends Super implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread is running");
        }
    }
}
public class RunnableApp {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(t1);
        t1.show();
        
        t2.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread is running");
        }
        
    }
}
