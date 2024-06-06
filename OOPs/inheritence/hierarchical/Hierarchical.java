class Parent{
    public String name;
    public int age;

    public void markForId(){
        System.out.println("Parent contains the black hair.");
    }
};
class Child1 extends Parent{
    public void markForId() {
        // TODO Auto-generated method stub
        System.out.println("Child1 hair is white.");
    }
};
class Child2 extends Parent{
    //over riding method....
    public void markForId() {
        // TODO Auto-generated method stub
        System.out.println("Child2 hair is Brown.");
    }
};
public class Hierarchical {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.name = "papa";
        p.age = 38;
        System.out.print("Mark for Identifying "+ p.name +" : ");
        p.markForId();

        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.name = "child1";
        c2.name = "child2";
        c1.age = 12;
        c2.age = 14;
        System.out.println();
        System.out.print("Mark for Identifying "+ c1.name +" : ");
        c1.markForId();
        System.out.println();
        System.out.print("Mark for Identifying "+ c2.name +" : ");
        c2.markForId();
    }
}
