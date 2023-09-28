import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        System.out.println("Please enter your age:");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
        }else{
            System.out.println("You have entered an invalid value.");
            System.exit(0);
        }
        if (age >= 21) {
            System.out.println("You get a wristband!");
        }else{
            System.exit(0);
        }
    }
}