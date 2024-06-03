//method overloading is just...
// call method same name with diff passing parameters...
class Shape{
    public int width;
    public int len;

    // method.....
    public void area(int w,int l){
        System.out.println("The Area using int is: "+ w*l);
    }
    public void area(float w,float l){
        System.out.println("The Area using float is: "+ w*l);
    }
    public void area(double w, double l){
        System.out.println("The Area using double para is: "+ w*l);
    }
};
public class overloading {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        // calling int method....
        s1.area(4,6);
        s1.area(4.2342f,35.32342f);
        s1.area(23.234234d,23.324d);
    }
}
