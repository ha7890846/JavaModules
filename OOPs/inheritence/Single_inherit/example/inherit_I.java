package example;
// package OOPs.inheritence;
// this is Parent/Super/Base class....
class Smartphone{
    // Data members......
    public String brand;
    public String modal;
    public int launch_date;

    // Methods.....
    public void gamingPhone(){
        System.out.println("This is a gaming Phone.");
    }
    public void budgetPhone(){
        System.out.println("this is a budget phone.");
    }
};

// This is Child/subClass/Derived class of smartphone...
class Samsung extends Smartphone{
    // child class contains all data member and methods of super/parent class...
    public double size;

    // method..
    public void processor(){
        System.out.println("This is Contains Spd 888+ chipset.");
    }
};

public class inherit_I {
    public static void main(String[] args) {
        Smartphone x1 = new Smartphone();
        x1.brand = "Iphone";
        x1.modal = "xxx";
        x1.launch_date = 2014;
        
        System.out.println("Properties of iphone: ");
        x1.gamingPhone();
        x1.budgetPhone();
        Samsung s1 = new Samsung();
        s1.size = 7.65;
        System.out.println("Properties of Samsung: ");
        s1.processor();
        s1.gamingPhone();
    }
}
