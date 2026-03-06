import java.util.Scanner;

public class driveornot {

  
    static void checkDrive(int age) {
        if (age >= 18) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkDrive(age);  
    }
}