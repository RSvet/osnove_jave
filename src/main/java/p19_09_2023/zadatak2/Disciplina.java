package p19_09_2023.zadatak2;

import java.util.ArrayList;

public class Disciplina {
    private String ime;
    private String tip;

    private ArrayList<Atleticar> atleticari;

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }

    public void dodajAtleticara(Atleticar atleticar){
        this.atleticari.add(atleticar);
    }

    public void diskvalifikuj(String imePrezime){
        for (int i = 0; i < atleticari.size(); i++) {
            if(atleticari.get(i).getImePrezime().equals(imePrezime))
                this.atleticari.remove(atleticari.get(i));
        }

    }

    private Atleticar najbolji(){
        if (atleticari.isEmpty()) return null;
        Atleticar najbolji = atleticari.get(0);
        for (int i = 0; i < atleticari.size(); i++) {
            if(!najbolji.isBetter(atleticari.get(i)))
                najbolji = atleticari.get(i);
        }

        return najbolji;

    }

    public void pobednik(){

        System.out.println("Pobednik u disciplini "+this.ime+" je: ");
        this.najbolji().stampaj();

    }


}
