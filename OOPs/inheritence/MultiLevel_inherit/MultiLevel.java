class Parent{ 
    String name;
    String city;
    int age;

    void func1(){
        System.out.println("Calling parent func1.");
    }
};
class Child extends Parent{
    void func2(){
        System.out.println("Calling child fun2");
    }
};
class GrandChild extends Child{
    void fun3(){
        System.out.println("callling G_child fun3");
    }
};
public class MultiLevel {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        GrandChild g_child = new GrandChild();

        System.out.print("\n");
        System.out.println("Calling parent class: ");
        p1.func1();
        // calling child class.
        System.out.print("\n");
        System.out.println("Calling child class: ");
        c1.func1();
        c1.func2();
        //calling g_child class......
        System.out.print("\n");
        System.out.println("Calling GrandChild class: ");
        g_child.func1();
        g_child.func2();
        g_child.fun3();
    }
}
