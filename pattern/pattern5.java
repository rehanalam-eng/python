public class pattern5 {

    // Function to print inverted triangle
    public static void printTriangle(int n) {
        for (int i = n; i >= 1; i--) {   // rows
            for (int j = 1; j <= i; j++) {  // columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);  // function call
    }
}