package p11_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        /*

        U glavnom programu kreirati dva objekta:
        Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
        Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

         */

        Tacka prvaTacka = new Tacka();
        prvaTacka.setX(10);
        prvaTacka.setY(20);
        prvaTacka.stampaj();

        Tacka drugaTacka = new Tacka(30,40);
        drugaTacka.stampaj();


    }
}
