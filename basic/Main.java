import java.util.Scanner;

public class Main {
    static int fib(int num){
        // base Case
        if(num == 0|| num == 1){
            return num;
        }
        int ans = (fib(num-1)+fib(num-2));
        return ans;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        num = sc.nextInt();
        System.out.println("Printing the Fibonacci Series: ");
        int i = 0;
        while(i<num){
            System.out.println(fib(i));
            i++;
        }
        sc.close();     // closing the scanner obj
    }
}