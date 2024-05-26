import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        System.out.println("Welcome into the Ticket Generator.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of candidate: ");
        int age = sc.nextInt();
        if(age >= 10 && age <=20){
            System.out.println("Ticket price: "+ age*2);
        }else if(age > 20 && age <=40) {
            System.out.println("\tTicket Price:: " + age * 2);
        }else if(age >40 && age <= 80){
            System.out.println("\tTicket Price:: " + age*2);
        }else{
            System.out.println("\tYour are Free from Ticket.");
        }
    }
}
