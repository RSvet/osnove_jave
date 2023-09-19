package p19_09_2023.zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {
    private String grad;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava(String grad) {
        this.grad = grad;
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat){
        this.objekti.add(objekat);
    }

    public Objekat najveciPorez(){

        Objekat maxPorez = objekti.get(0);

        for (int i = 0; i < objekti.size(); i++) {

            if(maxPorez.porez() < objekti.get(i).porez())
                maxPorez = objekti.get(i);
        }
        return maxPorez;

    }

    public Objekat najmanjiPorez(){

        Objekat minPorez = objekti.get(0);

        for (int i = 0; i < objekti.size(); i++) {

            if(minPorez.porez() > objekti.get(i).porez())
                minPorez = objekti.get(i);
        }
        return minPorez;
    }

    public double ukupanPorez(){
        double sumaPoreza=0;
        for (int i = 0; i < objekti.size(); i++) {

            sumaPoreza+=objekti.get(i).porez();
        }
        return sumaPoreza;
    }

    public void stampaj(){
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();
        }
    }
}
