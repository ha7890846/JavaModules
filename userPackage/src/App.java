// below statement import only Student package.
import mypack.Student;
//below statement import all the package
// from myPack repo...
import mypack.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Student s = new Student();
        s.run();
        Teacher t = new Teacher();
        t.teaching();
    }
}
