
import java.util.*;
public class divisibleby9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        if (number%9==0){
            System.out.println("Divisible by 9");
        }
      else {
        System.out.println("Not divisible by 9");
      }
    }
}