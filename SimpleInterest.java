public class SimpleInterest {

    static float SI(float p, float r, float t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        System.out.println("Simple Interest = " + SI(1000, 5, 2));
    }
}