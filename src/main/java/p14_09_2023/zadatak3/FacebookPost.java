package p14_09_2023.zadatak3;

import java.util.ArrayList;

public class FacebookPost {
    private String korisnik;
    private String objava;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String korisnik, String objava) {
    this.korisnik = korisnik;
    this.objava = objava;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < reakcije.size(); i++) {
            if(reakcije.get(i).getKorisnik().equals(reakcija.getKorisnik()))
                reakcije.remove(reakcije.get(i));
        }
        this.reakcije.add(reakcija);
    }

    private int vratiReakciju(String reakcija){
        int count=0;
        for (int i = 0; i < reakcije.size(); i++) {
            if(reakcije.get(i).getTip().equals(reakcija))
                count++;
        }
        return count;
    }

    public void print(){
        System.out.println(this.korisnik);
        System.out.println(this.objava);
        System.out.println("Smajli "+this.vratiReakciju("smajli")+" | Like "+this.vratiReakciju("like")+" | Srce "+this.vratiReakciju("srce"));
    }
}
