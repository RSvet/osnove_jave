package d08_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
        U glavnom programu kreirati objekat klase SmartAirConditioning i testirati sve metode.
         */

        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "Midea";
        klima.potrosnjaHladjenje = 2;
        klima.potrosnjaGrejanje = 4;
        klima.temperatura = 25;
        klima.mod = "hladi";


        klima.stampa();
        System.out.println("Mesecna potrosnja u kWh: "+klima.mesecnaPotrosnjakWh());
        System.out.println("Mesecna potrosnja u dinarima: "+klima.mesecnaPotrosnjaDin());


    }
}
