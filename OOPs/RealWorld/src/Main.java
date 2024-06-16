import java.util.Scanner;

interface Users {
    public void callback();
}

class Prime implements Users {
    public String name;
    public Prime() {}
    public Prime(String n) {
        name = n;
    }
    public void callback() {
        System.out.println("Invited " + name);
    }
}

class NonPrime implements Users {
    public String name;
    public NonPrime() {}
    public NonPrime(String n) {
        name = n;
    }
    public void callback() {
        System.out.println("You are not a Prime User: " + name);
    }
}

class Store {
    Users list[] = new Users[100];
    int list_count = 0;

    public void register(Users member) {
        list[list_count++] = member;
    }

    public void inviteSale() {
        for (int i = 0; i < list_count; i++) {
            list[i].callback();
        }
    }

    public void printUserTypes() {
        System.out.println("Prime Users:");
        for (int i = 0; i < list_count; i++) {
            if (list[i] instanceof Prime) {
                System.out.println(((Prime) list[i]).name);
            }
        }
        System.out.println("Non-Prime Users:");
        for (int i = 0; i < list_count; i++) {
            if (list[i] instanceof NonPrime) {
                System.out.println(((NonPrime) list[i]).name);
            }
        }
    }
}

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Store s = new Store();
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the Num value: ");
        num = sc.nextInt();
        Prime obj1[] = new Prime[num];
        NonPrime obj2[] = new NonPrime[num];
        for (int i = 0; i < num; i++) {
            int choice;
            System.out.println("Enter the choice \n1. PrimeUser\n2.NonPrimeUser");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the user name: ");
                    String primeName = sc.next();
                    obj1[i] = new Prime(primeName); // Initialize the Prime object
                    s.register(obj1[i]);
                    break;
                case 2:
                    System.out.println("Enter the user name: ");
                    String nonPrimeName = sc.next();
                    obj2[i] = new NonPrime(nonPrimeName); // Initialize the NonPrime object
                    s.register(obj2[i]);
                    break;
                default:
                    System.out.println("Not valid choice.");
                    break;
            }
        }
        s.inviteSale();
        s.printUserTypes(); // Print the list of Prime and Non-Prime users
    }
}
