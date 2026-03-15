import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        int num, original, remainder, result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            remainder = num % 10;
            result = result + remainder * remainder * remainder;
            num = num / 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}