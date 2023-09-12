package p12_09_2023.zadatak3;

public class ViberPoruka {
    private String tekst;
    private String vreme;
    private ViberKorisnik posiljalac;
    private ViberKorisnik primalac;
    private ViberReakcija reakcija;
    public ViberPoruka(String tekst, String vreme, ViberKorisnik posiljalac, ViberKorisnik primalac, ViberReakcija reakcija){
        this.tekst = tekst;
        this.vreme = vreme;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija = reakcija;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    public String getTekst(){
        return this.tekst;
    }
    public void setVreme(String vreme){
        this.vreme = vreme;
    }
    public String getVreme(){
        return this.vreme;
    }
    public void setPosiljalac(ViberKorisnik posiljalac){
        this.posiljalac = posiljalac;
    }
    public ViberKorisnik getPosiljalac(){
        return this.posiljalac;
    }
    public void setPrimalac(ViberKorisnik primalac){
        this.primalac = primalac;
    }
    public ViberKorisnik getPrimalac(){
        return this.primalac;
    }
    public void prikazi(){
        String aktivnost = this.posiljalac.getAktivan()?" ActiveNow ":" Not Active";
        System.out.println("From: "+this.posiljalac.getIme()+ "* "+aktivnost+" - at "+this.vreme);
        System.out.println("To: "+this.primalac.getIme());
        System.out.println(this.tekst+" : "+this.reakcija.getEmoji()+" from "+this.reakcija.getKorisnik().getIme());
    }
}
