public class sqperi {

    static int perimeter(int side) {
        int p = 4 * side;
        return p;
    }

    public static void main(String[] args) {
        int result = perimeter(6);
        System.out.println("Perimeter of square = " + result);
    }
}