import java.util.Scanner;

public class sq {

    
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = square(number);   
        System.out.println("Square = " + result);
    }
}