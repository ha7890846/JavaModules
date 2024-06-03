
class Parent{
    public void working(String name){
        System.out.println("These are the parent class Method: "+ name);
    }
};
class Child extends Parent{
    public void working(String name){
        System.out.println("The name of child is: "+ name);
        System.out.println("This is the Child class method using overiding");
    }
};
public class overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();


        p.working("Amrinder");
        c.working("Bahubali");
    }    
}
