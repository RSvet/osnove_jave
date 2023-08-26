package d25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
       /* 4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
            / / / / /
        Napomena: Metoda nista ne vraca.
        */
        print(5,"/");
    }

    public static void print(int n, String x){
        for (int i = 0; i < n; i++) {
            System.out.print(x+" ");
        }
    }
}
