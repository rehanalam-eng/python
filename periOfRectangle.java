public class periOfRectangle {

    static int perimeterOfRectangle(int l, int b) {
        int perimeter = 2 * (l + b);
        return perimeter;   
    }

    public static void main(String[] args) {
        int result = perimeterOfRectangle(4, 5);
        System.out.println("perimeter of rectangle = " + result);
    }
}