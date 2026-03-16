import java.util.Scanner;

public class SumOfDigits {

  
    static int sumDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);  
            num = num / 10;          
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = sumDigits(number);

        System.out.println("Sum of digits = " + result);
    }
}