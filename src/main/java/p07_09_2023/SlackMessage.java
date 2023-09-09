package p07_09_2023;

public class SlackMessage {
    public String tekst;
    public String posiljalac;
    public String datumVreme;

    public String datumAzuriranja;

    public void print(){
        System.out.println(this.posiljalac+" - "+this.datumVreme);
        System.out.println(this.tekst);
        System.out.println("Azurirano: "+this.datumAzuriranja);
    }

    public String convertToString(){
        String result = posiljalac+" - "+ datumVreme + " "+tekst;
      return result;
    }
    public void azuriraj(String noviTekst, String noviDatum){
        this.tekst = noviTekst;
        this.datumAzuriranja = noviDatum;
    }
}
