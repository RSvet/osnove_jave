package d07_09_2023;

public class Dostava  {
    public int deliveryNumber;
    public Vozac driver;
    public Ruta route;
    public Vozilo vehicle;
    public String status;

    public void ispis(){
        System.out.println("Dostava br. "+deliveryNumber+" vozac: "+driver.ime+" "+driver.prezime+
        " vozilo: "+vehicle.marka+" "+vehicle.model+", na ruti: "+route.polaznaTacka+" - "+route.odrediste+
        ", "+route.duzinaKm+"km, procenjeno vreme dostave: "+route.brojDana+", ima status: "+status);
    }
}
