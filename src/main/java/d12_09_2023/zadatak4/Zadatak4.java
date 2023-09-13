package d12_09_2023.zadatak4;

public class Zadatak4 {
    public static void main(String[] args) {
    Ringla ringla1 = new Ringla("ekspres", 1.5);
    Ringla ringla2 = new Ringla("obicna", 1);
    Ringla ringla3 = new Ringla("ekspres", 0.5);
    Ringla ringla4 = new Ringla("ekspres", 1.5);

    ElektricniSporet sporet = new ElektricniSporet("Beko", 5, 2, ringla1, ringla2, ringla3, ringla4);

    ringla2.pojacajRinglu();

    sporet.pojacaj(1);
    sporet.print();

    System.out.println(sporet.ukupnaPotrosnja(3));



    }
}
