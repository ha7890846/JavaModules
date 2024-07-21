
class WhiteBoard{
    String text;
    int countStu= 0;
    int count = 0;
    synchronized public void write(String statement){
        System.out.println("Teacher writting:" + statement);
        while(count != 0){
            try {
                wait();
            } catch (Exception e) {}
        }
        text = statement;
        count = countStu;
        notifyAll();
    }
    synchronized public String read(){
        while(count == 0){
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        String outStatement = text;
        count--;
        if(count == 0){
            notify();
        }
        return outStatement;
    }
    public void attendance(){
        countStu++;
    }
}
class Teacher extends Thread{
    WhiteBoard whiteBoard;
    String notes[] = {"Java is Programming Langg.","It contains OOPs.","It is plateform Independent","end"};
    public Teacher(WhiteBoard w){
        whiteBoard = w;
    }
    public void run(){
        for(int i =0;i<notes.length;i++){
            whiteBoard.write(notes[i]);
        }
    }
}
class Student extends Thread{
    WhiteBoard whiteBoard;
    String studentName;
    public Student(String studentName,WhiteBoard w){
        whiteBoard = w;
        this.studentName = studentName;
    }
    public void run(){
        String readStatment;
        whiteBoard.attendance();
        do{
            readStatment = whiteBoard.read();
            System.out.println(studentName + " read:" + readStatment);
        }while(!readStatment.equals("end"));
    }
}

public class runner {
    public static void main(String[] args) 
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    } 
}

