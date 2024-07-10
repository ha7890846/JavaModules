class Account
{
   private int accno;
   private String name;
   private double balance;
   private String address;
    public Account(){};

    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
class SvAcc extends Account{
    public void deposit(int amount){
        setBalance(getBalance()+amount);
        System.out.println("after deposti Remaining balance :"+getBalance());
    }
    public void withdraw(int amount){
        setBalance(getBalance()-amount);

        System.out.println("after withdraw Remaining balane :"+getBalance() );
    }
}
class loanAcc extends Account{
    public void payEmi(){
        System.out.println("You Have to pay Emi.");
    }
    public void repayment(){
        System.out.println("Your Payment is completed.");
    }
}
public class runner{
    public static void main(String[] args) {
        SvAcc obj = new SvAcc();
        obj.setAccno(1234);
        obj.setName("Rahul");
        obj.setBalance(10000);
        obj.setAddress("Bangalore");
        obj.deposit(100);
        obj.withdraw(300);
    }
}