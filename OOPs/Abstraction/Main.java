abstract class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
        
    }
    public void setName(String name) {
        this.name = name;
        
    }
    public int getAge() {
        return age;
        
    }
    public void setAge(int age) {
        this.age = age;
        
    }
    public Person() {
        //TODO Auto-generated constructor stub
    }
    abstract public void work();
}
class Child extends Person{
    @Override
    public void work() {
        System.out.println("Child is working");
    }
}
public class Main {
    public static void main(String[] args) {
        // we can't instance a obj for any Abstract class...
        Child obj = new Child();
        Person aa = new Child();
        obj.setName("Roman");
        obj.equals(obj);
    }
}
