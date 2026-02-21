public class FN4 {

    
    static double areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {

        double result = areaOfTriangle(5, 4);  
        System.out.println("Area of Triangle = " + result);
    }
}