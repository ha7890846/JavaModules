
class Person{
    // These are the data member/ Attributes of obj....
    public int age;
    public String name;
    // These are the function/Method/Behaviour of Obj....
    public void work(){
        System.out.println("he is running.");
    }
    public void singing(){
        System.out.println("He is the famous Singer.");
    }
    // constuctors.....
    Person(){

    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
};

public class prog_class {
    public static void main(String[] args) {
        System.out.println("Hello coder");
        Person man1 = new Person();
        man1.age = 20;
        man1.name = "Rahul";
        System.out.println("The age of person1 is: "+ man1.name);
        System.out.println("The name of person1 is: " + man1.age);
        man1.work();
        Person man2 = new Person("john",30);
        System.out.println("Here is the Name of person2: "+ man2.name);
        System.out.println("The age of Person2 is: " + man2.age);
        man2.singing();
    }
}