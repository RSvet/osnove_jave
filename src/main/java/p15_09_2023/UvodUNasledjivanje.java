package p15_09_2023;

public class UvodUNasledjivanje {
    public static void main(String[] args) {

        Auto a = new Auto();

        Kamion k = new Kamion();

        a.setRegistracija("NS-2921");
        a.setBrojVrata(5);
        a.setMarka("Mercedes");
        a.stampaj();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.koci();

        k.setRegistracija("BG-2456");
        k.setMarka("FAP");
        k.setNosivost(2000);
        k.stampaj();
        k.dodajGas();
        k.dodajGas();
        k.dodajGas();
        k.koci();
    }
}
