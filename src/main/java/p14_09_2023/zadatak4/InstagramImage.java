package p14_09_2023.zadatak4;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag>tagovi;
    private int duzina;
    private int visina;
    private String putanja;

    public InstagramImage(int duzina, int visina, String putanja) {
        this.duzina = duzina;
        this.visina = visina;
        this.putanja = putanja;
        this.tagovi = new ArrayList<>();
    }

    public void dodajTag(InstagramTag tag){
        this.tagovi.add(tag);
    }

    public void print (){
        System.out.println("Slika ima duzinu "+this.duzina+", visinu: "+this.visina);
        System.out.println("Putanja slike "+this.putanja);
        System.out.println("Tagovani: ");
        for (int i = 0; i < this.tagovi.size(); i++) {
            this.tagovi.get(i).getTaggedUser().stampa();
        }
    }
}
