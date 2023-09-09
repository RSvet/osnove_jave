package d07_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
            /*
     Zadatak 2: Kreiranje klase "Automobil"
     Napišite klasu "Automobil" sa atributima: marka (String),
     model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti.
     Ispisati informacije o automobilima.
     */

        Automobil firstCar = new Automobil();
        Automobil secondCar = new Automobil();
        Automobil thirdCar = new Automobil();

        firstCar.marka = "Mercedes";
        firstCar.model = "AMG SL Roadster";
        firstCar.godinaProizvodnje = 2023;

        secondCar.marka = "Peugeot";
        secondCar.model ="907";
        secondCar.godinaProizvodnje = 2004;

        thirdCar.marka = "Bentley";
        thirdCar.model = "Batur";
        thirdCar.godinaProizvodnje = 2023;


        System.out.println("Automobil marke: "+firstCar.marka+", model: "+firstCar.model+", godina proizvodnje: "+firstCar.godinaProizvodnje);
        System.out.println("Automobil marke: "+secondCar.marka+", model: "+secondCar.model+", godina proizvodnje: "+secondCar.godinaProizvodnje);
        System.out.println("Automobil marke: "+thirdCar.marka+", model: "+thirdCar.model+", godina proizvodnje: "+thirdCar.godinaProizvodnje);



    }




}
