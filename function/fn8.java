import java.util.Scanner;

public class fn8 {

    // Function to display greeting
    static void greet(String name) {
        System.out.println("Hello, " + name + "i am avalaible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        greet(userName);   // Calling function

        sc.close();
    }
}