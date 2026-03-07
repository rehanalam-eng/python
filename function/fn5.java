import java.util.Scanner;

public class fn5 {

    static void checkAnswer(boolean answer) {
        if (answer == true) {
            System.out.println("Correct! Java is fun 😄");
        } else {
            System.out.println("Oops! That's false.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Java is a programming language (true/false): ");
        boolean userAnswer = sc.nextBoolean();

        checkAnswer(userAnswer);   // function call
    }
}