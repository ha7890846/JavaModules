public class methods {
    static int sum(int x,int y){
        return x+y;
    }
    //Using of same-name of methods is known as Method-Overloading...
    static float sum(float x,float y){
        return x+y;
    }
    static double sum(double x,double y){
        return x+y;
    }
    // void type......
    static void callingName(String str){
        int foundIndex = str.indexOf('@');
        String foundName = str.substring(0, foundIndex);
        System.out.println("The Name found in email is: "+ foundName);
    }
    // Return String type......
    static String knowDomain(String str){
        int foundIndex = str.indexOf('@');
        String foundDomain = str.substring(foundIndex);
        return foundDomain;
    }
    public static void main(String[] args) {
        int a =10;
        int b = 11;
        float c = 10.110f;
        float d = 121.212f;
        double e = 123.1231d;
        double f = 12.3123d;
        System.out.println("The Sum of "+a+" and "+ b+" is: "+sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(sum(e,f));
        float sumOfFloat = sum(c,d);
        System.out.printf("the float value %f and %f, The sum is:%f ",c,d,sumOfFloat);
        System.out.println();


        //Return void type........
        String email = "ha78908446@gmail.com";
        callingName(email);


        //return String type.......
        String foundDomain = knowDomain(email);
        System.out.println("The Domain Name of email is: "+ foundDomain);
    }
}
