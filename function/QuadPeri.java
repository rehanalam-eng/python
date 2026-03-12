import java.util.Scanner;

public class QuadPeri {

   
    static double perimeter(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        System.out.print("Enter side d: ");
        double d = sc.nextDouble();

        double result = perimeter(a, b, c, d);

        System.out.println("Perimeter of Quadrilateral = " + result);
    }
}