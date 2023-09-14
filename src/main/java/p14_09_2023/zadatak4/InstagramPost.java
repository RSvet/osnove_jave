package p14_09_2023.zadatak4;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList<InstagramImage>slike;
    private String opis;

    public InstagramPost(String opis) {
        this.opis = opis;
        this.slike = new ArrayList<>();
    }


    public void dodajSliku(InstagramImage slika){
        this.slike.add(slika);
    }

    public void stampa(){
        for (int i = 0; i < slike.size(); i++) {
            slike.get(i).print();
        }
        System.out.println("Opis: "+this.opis);
    }
}
