package d11_09_2023.zadatak3;

public class Video {
    /*
    ●	svi atributi su private
    ●	id videa - koji je string i na primer izgleda v6tuOipj5mk
    ●	naziv videa
    ●	duzinu videa u sekundama (npr: ako je video 2min i 10s, duzina je 130)
    ●	broj lajkova
    ●	broj dislajkova
    ●	broj pregleda
    ●	metodu lajkuj - koja povecava broj lajkova za jedan
    ●	metodu dislajkuj - koja povecava broj dislajkova za jedan
    ●	metodu pogledaj - koja povecava broj pregleda za jedan
    ●	gettere za sve atribute
    ●	settere nemamo
     */

    private String id;
    private String naziv;
    private int duzina;
    private int lajkovi;
    private int dislajkovi;
    private int pregledi;

    public Video(String id, String naziv, int duzina){
        this.id = id;
        this.naziv = naziv;
        this.duzina = duzina;

    }
    public void lajkuj(){
        this.lajkovi+=1;
    }
    public void dislajkuj(){
        this.dislajkovi+=1;
    }
    public void pogledaj(){
        this.pregledi+=1;
    }

    public String getId(){return this.id;}

    public String getNaziv(){return this.naziv;}
    public int getDuzina(){return this.duzina;}
    public int getLajkovi(){return this.lajkovi;}
    public int getDislajkovi(){return this.dislajkovi;}
    public int getPregledi(){return this.pregledi;}


}
