package d19_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
/*

U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

 */

        Korpa korpa = new Korpa();

        SuperKartica kartica = new SuperKartica("123 456 85224","Pera Peric",200);

        Ambalaza prvaAmbalaza = new StaklenaAmbalaza("328232-2823", "pivo", 400, 500, 20,true, 120.99 );
        Ambalaza drugaAmbalaza = new Tetrapak("741-85369", "mleko",200,250, false,150);
        Ambalaza trecaAmbalaza = new Tetrapak("852-9632", "sok", 650,720,true,200);
        Ambalaza cetvrtaAmbalaza = new Tetrapak("522-92314", "jogurt", 200,250,false,165);

        korpa.dodajAmbalazu(prvaAmbalaza);
        korpa.dodajAmbalazu(drugaAmbalaza);
        korpa.dodajAmbalazu(trecaAmbalaza);
        korpa.dodajAmbalazu(cetvrtaAmbalaza);

        korpa.izbaciAmbalazu("522-92314");


        prvaAmbalaza.stampaj();

        drugaAmbalaza.stampaj();

        trecaAmbalaza.stampaj();

        cetvrtaAmbalaza.stampaj();

        kartica.stampaj();

        System.out.println("Ukupna cena sa popustom "+korpa.ukupnaCena(kartica));




    }
}
