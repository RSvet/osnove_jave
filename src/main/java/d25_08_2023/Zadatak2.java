package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        2.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
        METODA NISTA NE STAMPA.
        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

         */

        int concatenatedNumber = concatenateNumbers(6,2);
        System.out.println(concatenatedNumber);

    }

    public static int concatenateNumbers(int a, int b){
        return a*10+b;
    }
}
