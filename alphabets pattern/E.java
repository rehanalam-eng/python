public class E {
    public static void main(String[] args) {
        int height = 5;
        int width = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {

                // Conditions for printing E
                if (i == 1 || i == height || i == height/2 + 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}