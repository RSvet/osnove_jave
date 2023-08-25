package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        calculate(1,2);
        System.out.println();
        calculate(5,2);
        System.out.println();
        calculate(3,1);
    }

    public static void calculate(int a, int b){
        System.out.println("Zbir: "+(a+b));
        System.out.println("Razlika: "+(a-b));
        System.out.println("Proizvod: "+(a*b));
        System.out.println("Kolicnik: "+(a/b));
    }
}
