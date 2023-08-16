package d15_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        int a = 10;
        double SQRT_THREE = 1.73;

        double area = SQRT_THREE / 4 * a*a;
        int perimeter = 3*a;

        System.out.println("Povrsina trougla: "+area+".");
        System.out.print("Obim trougla: "+perimeter+".");
    }
}
