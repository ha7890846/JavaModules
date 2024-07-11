
interface Bike{
    // it is set as public, static and final;
    int speed =200;
    // by default below method are public and abstract.. 
    void run();
    void stop();
    default void working(){System.out.println("Defualt Bike is working Condition.");}

    // below is wrong statement.
    // speed is set to public, static and final constant;
    // speed = speed +100;
}
interface SportBike extends Bike{
    int MAX_SPEED = 465;
    void wheelieSupport();
}
//  legal termss....below
//marker or tagged interface..
interface NakedBike extends SportBike{

}
//marker or tagged interface.....
// legal terms....below
abstract class SuperNaked implements SportBike{

}
class Honda implements Bike{
    public void run(){
        System.out.println("Honda is running");
    }
    public void stop(){
        System.out.println("Honda is stopping");
    }
}
class Bjaj implements Bike{
    public void run(){
        System.out.println("Bjaj is running");
    }
    public void stop(){
        System.out.println("Bjaj is stopping");
    }
}
class Pulsar_NS implements SportBike{
    //Each and every method must be override in the implemented class.
    // of super interface or sub interface
    public void run(){
        System.out.println("Pulsar is running");
    }
    public void stop(){
        System.out.println("Pulsar is stopped");
    }
    public void wheelieSupport(){
        System.out.println("This Pulsar Support Wheelie on Back and front case.");
    }
}
public class basic_interface {
    public static void main(String[] args) {
        System.out.println("\tHonda instance >>>\n");
        Honda h = new Honda();
        System.out.println(h.speed);
        h.run();
        h.stop();
        h.working();
        System.out.println("\tNow The Bjaj Instance...\n");
        Bjaj b = new Bjaj();
        b.run();
        b.stop();
        b.working();
        System.out.println("\t The Pulsar Instance .....\n");
        Pulsar_NS ns = new Pulsar_NS();
        System.out.println("The max speed of Pulsar:"+ ns.MAX_SPEED);
        ns.run();
        ns.stop();
        ns.wheelieSupport();
        b.working();
    }
}
