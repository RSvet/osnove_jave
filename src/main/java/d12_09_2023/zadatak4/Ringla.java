package d12_09_2023.zadatak4;

public class Ringla {
    /*
    Kreirati klasu Ringla koja ima:
    ●	tip ringle (obicna ili ekspres)
    ●	jacinu
    ○	za obicnu ringu jacina je u opsegu od 0 do 3
    ○	za ekspres ringlu jacina je u opsegu od 0 do 12
    ●	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
    ●	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
    ●	getter za jacinu
    ●	setteri ne postoje!!
    ●	privatnu metodu koja vraca maksimalan broj pojacavanja
    ○	za obicnu je 3, za ekspres je 12
    ●	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
    ●	metodu iskljuci ringlu - metoda postavlja jacinu na 0
    ●	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
    ●	metodu koja vraca potrosnju elektricne energije prema formuli
    ○	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
    ○	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
    ●	metodu koja stampa podatke u formatu:
        Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
    Tip ringle: tip ringle
    Jacina: jacina
    Grejac: jacina grejaca kW
     */

    private String tip;
    private int jacina;
    private double grejac;
    public Ringla(String tip, double grejac){
        this.tip = tip;
        this.grejac = grejac;
        this.jacina = 0;
    }
    public int getJacina(){
        return this.jacina;
    }
    public String getTip(){
        return this.tip;
    }
    private int maxPojacavanja(){
        if(this.tip.equals("obicna"))
            return 3;
        else if (this.tip.equals("ekspres"))
            return 12;
        return 0;
    }
    public void pojacajRinglu(){
        if(this.jacina <  this.maxPojacavanja()){
            this.jacina++;
        }
    }
    public void iskljuciRinglu(){
        this.jacina = 0;
    }
    public boolean ukljucena(){
       return this.jacina > 0;
    }

    public double potrosnja(int h){
        if(this.jacina!=0)
        return 100/(this.maxPojacavanja()*this.jacina*this.grejac*h);
        else return 0;
    }

    public void print(){
        System.out.println("Ringla je "+(this.ukljucena() ? "ukljucena":"iskljucena"));
        System.out.println("Tip ringle: "+this.tip);
        System.out.println("Jacina: "+this.jacina);
        System.out.println("Grejac: "+this.grejac+"kW");
    }
}
