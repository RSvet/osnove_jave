package d15_08_2023;

public class vezbanjeSlack1 {
    public static void main(String[] args) {
        int r = 140;
        int g = 12;
        int b = 100;

        int rKontrast = 255 - r;
        int gKontrast = 255 - g;
        int bKontrast = 255 - b;

        System.out.println("Originalna boja: RGB("+r+", "+g+", "+b+").");
        System.out.print("Kontrastna boja: RGB("+rKontrast+", "+gKontrast+", "+bKontrast+").");
    }
}
