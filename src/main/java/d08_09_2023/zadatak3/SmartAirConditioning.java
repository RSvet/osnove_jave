package d08_09_2023.zadatak3;

public class SmartAirConditioning {
         /*
        (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
        ●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        ●	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
        ●	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
        ●	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
        ●	atribut za mod (hladi/greje)
        ●	metodu za stampu - stampa u formatu
            marka - mod - termperatura
        ●	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
        ○	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
        ●	metodu koja racuna koliko klima novca potrosi za mesec dana
        ○	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
        ○	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
        ○	Metoda vraca ukupnu cenu za taj mesec
         */
     public String marka;
     public int potrosnjaHladjenje;
     public int potrosnjaGrejanje;
     public int temperatura;
     public String mod;

     public void stampa(){
         System.out.println( this.marka + " - " + this.mod + " - " + this.temperatura + "°C");
     }
     public int mesecnaPotrosnjakWh(){
         if(this.mod.equals("hladi"))
             return 30 * 15 * potrosnjaHladjenje;
         else return 30 * 15 * potrosnjaGrejanje;
     }

     public int mesecnaPotrosnjaDin(){
         if(this.mesecnaPotrosnjakWh()<= 350)
             return this.mesecnaPotrosnjakWh()*6;

         else return this.mesecnaPotrosnjakWh()*9;

     }

}
