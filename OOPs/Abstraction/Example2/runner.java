
abstract class KFC{
    public KFC(){
        System.out.println("\t\t\t******KFC is a fast food restaurant"+
         "chain that specializes in fried chicken products.*************");
    }
    public void itemList(){
        System.out.println("KFC itemList is below:");
        System.out.println("\t1. Chicken Fries");
        System.out.println("\t2. Chicken Changezzy.");
        System.out.println("\t3. Chicken Mughlai.");
    }
    // these Below constraints are for the merchant....
    // he can obtain these by their Choice...
    // these depends over merchant....
    public abstract void chef();
    public abstract void offer();
    public abstract void billing();
}
class MyKFC extends KFC{
    public void chef(){
        System.out.println("Chef list is below:");
        System.out.println("\t1. Chef M. Adnan Warsi");
        System.out.println("\t2. Chef Master Raazi Wasim");
    }
    public void offer(){
        System.out.println("Offer is below:");
        System.out.println("\t1. 10% off on all the items");
        System.out.println("\t2. 20% off on all the items");
    }
    public void billing(){
        System.out.println("Billing is below:");
        System.out.println("\t1. Pay using Cash Mode.");
        System.out.println("\t2. UPI online Transaction.");
    }

}
public class runner {
    public static void main(String[] args) {
        MyKFC obj = new MyKFC();
        obj.itemList();
        obj.chef();
        obj.offer();
        obj.billing();        
    }
}
