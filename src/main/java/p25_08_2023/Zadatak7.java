package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
       boolean isRightAngled = isTriangleRightAngled(3,4,5);
        System.out.println(isRightAngled);
    }

    public static boolean isTriangleRightAngled(int a, int b, int c){

        return a * a + b * b == c * c;
    }
}
