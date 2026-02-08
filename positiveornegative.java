
import java.util.*;
public class positiveornegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int number = sc.nextInt();
        if (number >0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}