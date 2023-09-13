package d12_09_2023.zadatak4;

import java.util.ArrayList;
import java.util.Arrays;

public class ElektricniSporet {
    /*
    Kreirati klasu ElektricniSporet koja ima:
    ●	marku sporeta (npr: Beko, Bosh)
    ●	garanciju kao broj godina
    ●	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
    ●	4 ringle
    ○	gore levo
    ○	gore desno
    ○	dole levo
    ○	dole desno
    ●	konstruktor koji postavlja sve atribute
    ●	gettere za sve atribut
    ●	ne postoje setteri
    ●	metodu pojacaj kojoj se prosledjuje pozicija ringle
    ○	pozicija 1 je ringla gore levo
    ○	pozicija 2 je ringla gore desno
    ○	pozicija 3 je ringla dole levo
    ○	pozicija 4 je ringla dole desno
    ○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije
    ○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
    ●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
    ○	pozicija 1 je ringla gore levo
    ○	pozicija 2 je ringla gore desno
    ○	pozicija 3 je ringla dole levo
    ○	pozicija 4 je ringla dole desno
    ●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
    ●	metodu koja stampa podatke u formatu:
    marka - garancija u godinama
    Ringle:
    Gore levo:
    Ringla je ukljucena/iskljucena
    Tip ringle: tip ringle
    Jacina: jacina
    Grejac: jacina grejaca kW
    Gore desno:
    Ringla je ukljucena/iskljucena
    Tip ringle: tip ringle
    Jacina: jacina
    Grejac: jacina grejaca kW
    Dole levo:
    Ringla je ukljucena/iskljucena
    Tip ringle: tip ringle
    Jacina: jacina
    Grejac: jacina grejaca kW
    Dole desno:
    Ringla je ukljucena/iskljucena
    Tip ringle: tip ringle
    Jacina: jacina
    Grejac: jacina grejaca kW
     */

    private String marka;
    private int garancija;
    private int maxRingle;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxRingle, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno){
        this.marka = marka;
        this.garancija = garancija;
        this.maxRingle = maxRingle;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }
    public String getMarka(String marka){
        return this.marka;
    }
    public int getGarancija(int garancija){
        return this.garancija;
    }
    public int getMaxRingle(int maxRingle){
        return this.maxRingle;
    }
    public Ringla getGoreLevo(Ringla goreLevo){
        return this.goreLevo;
    }
    public Ringla getGoreDesno(Ringla goreDesno){
        return this.goreDesno;
    }
    public Ringla getDoleLevo(Ringla doleLevo){
        return this.doleLevo;
    }
    public Ringla getDoleDesno(Ringla doleDesno){
        return this.doleDesno;
    }

    public void pojacaj(int pozicija){
        int counter = 0;
        ArrayList<Ringla> ringle = new ArrayList<>(Arrays.asList(goreLevo, goreDesno,doleLevo, doleDesno));

        for (int i = 0; i < ringle.size(); i++) {
            if(ringle.get(i).ukljucena())
                counter++;
        }
        if(pozicija == 1){
            this.goreLevo.pojacajRinglu();
            if(this.maxRingle <= counter){
                this.iskljuci(2);
                this.iskljuci(3);
                this.iskljuci(4);
            }
        }

        else if (pozicija == 2){

            this.goreDesno.pojacajRinglu();
            if(this.maxRingle <= counter){
                this.iskljuci(1);
                this.iskljuci(3);
                this.iskljuci(4);
            }
        }

        else if (pozicija == 3){
            this.doleLevo.pojacajRinglu();
            if(this.maxRingle <= counter){
                this.iskljuci(1);
                this.iskljuci(2);
                this.iskljuci(4);
            }
        }

        else if (pozicija == 4){
            this.doleDesno.pojacajRinglu();
            if(this.maxRingle <= counter){
                this.iskljuci(1);
                this.iskljuci(2);
                this.iskljuci(3);
            }
        }
    }
    public void iskljuci(int pozicija){
        if(pozicija == 1)
            this.goreLevo.iskljuciRinglu();
        else if (pozicija == 2)
            this.goreDesno.iskljuciRinglu();
        else if (pozicija == 3)
            this.doleLevo.iskljuciRinglu();
        else if (pozicija == 4)
            this.doleDesno.iskljuciRinglu();
    }
    public double ukupnaPotrosnja(int h){
        return this.goreLevo.potrosnja(h)+this.goreDesno.potrosnja(h)+this.doleLevo.potrosnja(h)+this.doleDesno.potrosnja(h);
    }

    public void print(){
        ArrayList<Ringla> ringle = new ArrayList<>(Arrays.asList(goreLevo, goreDesno,doleLevo, doleDesno));
        for (int i = 0; i < ringle.size(); i++) {
            ringle.get(i).print();
        }
    }
}
