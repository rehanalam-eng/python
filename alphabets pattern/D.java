public class D {
    public static void main(String[] args) {
        int n = 5; // height

        for (int i = 0; i < n; i++) {
            System.out.print("*"); // left vertical line

            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && j < n - 1) {
                    System.out.print("*"); // top and bottom
                } else if (j == n - 1 && i != 0 && i != n - 1) {
                    System.out.print("*"); // right curve
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}