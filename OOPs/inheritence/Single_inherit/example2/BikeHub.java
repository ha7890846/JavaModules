
// Parent class............

import java.util.Scanner;

class Bike{
    // data members......
    public String brand;
    public int mileage;

    // methods.....
    public void available(){
        System.out.println("The bike is available in showroom.");
    }
    public void notAvail(){
        System.out.println("The Bike is not present in showroom.");
    }

};
// sub- classs.....
class SportsBike extends Bike{
    //additional features from bikes
    static int max_torque = 200;

    public void performance(){
        System.out.println("The bike contains the max torque: " + SportsBike.max_torque);
    }


};
public class BikeHub {
    public static void main(String[] args) {
        // creat a obj 
        Bike obj = new Bike();
        System.out.print("Enter the bike brand:");
        Scanner sc = new Scanner(System.in);
        obj.brand = sc.nextLine();
        System.out.print("Enter mileage of bike: ");
        obj.mileage = sc.nextInt();

        System.out.println("\t\t ***The parent class Bike Properties..****");
        System.out.println("The Bike brand is: " + obj.brand);
        System.out.println("The Bike mileage is: " + obj.mileage);
        obj.available();
        System.out.println("\n\n");
        // user calls to invoke methods....
        // Acces properties of parent class...
        SportsBike objSportsBike = new SportsBike();
        System.out.print("Enter the Sportsbike brand:");
        objSportsBike.brand = sc.next();
        System.out.print("Enter mileage of Sportsbike: ");
        objSportsBike.mileage = sc.nextInt();
        System.out.println("\t\t ***The Sub class SportsBike Properties..****");
        System.out.println("The SportsBike brand is: " + obj.brand);
        System.out.println("The SportsBike mileage is: " + obj.mileage);
        objSportsBike.available();
        objSportsBike.performance();
    }    
}
