public class circumfOfCircle {

    static void CircumferenceOfCircle(float r) {
        float circumference = 3.14f * r * r;  
        System.out.println("circumference of circle = " + circumference );
    }

    public static void main(String[] args) {
        CircumferenceOfCircle(4);
         CircumferenceOfCircle(5);
    }
}
