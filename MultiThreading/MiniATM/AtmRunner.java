//check the diff of output by Removing synchronized keyword
// Both the customer thread will work simultaneously.
class ATM{
    synchronized public void checkBal(String name){
        System.out.println("checking"+name);
    }
    synchronized public void withdraw(String name,int amount){
        System.out.println("withdraw."+name+" :  "+ amount);
    }
}
class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    Customer(ATM atm,String name,int amount){
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }
    public void useAtm(){
        atm.checkBal(name);
        atm.withdraw(name,amount);
    }
    public void run(){
        useAtm();
    }
}
public class AtmRunner {
    public static void main(String[] args) {
        ATM atm1 = new ATM();
        Customer c1 = new Customer(atm1,"Rahul",1000);
        Customer c2 = new Customer(atm1,"Rajan",2000);
        c1.start();
        c2.start();
    }
}
