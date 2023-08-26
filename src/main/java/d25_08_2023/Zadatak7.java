package d25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
        /*
        7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
            U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

            Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
            Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

         */
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 1;

        System.out.println("Najmanji broj od "+firstNumber+", "+secondNumber+" i "+thirdNumber+" je "+returnMin(firstNumber,secondNumber,thirdNumber));
        }

        public static int returnMin(int a, int b, int c){
            if(a < b && a < c)
                return a;
            else if (b<a && b < c)
                return b;
            else return c;
        }
}
