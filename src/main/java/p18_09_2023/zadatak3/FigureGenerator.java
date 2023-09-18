package p18_09_2023.zadatak3;

import java.util.ArrayList;

public class FigureGenerator {
    public Figura generate(String tip){
        if(tip.equals("pravougaonik"))
            return new Pravougaonik(5,10);
        else if (tip.equals("trougao"))
            return new JednakostranicniTrougao(5);
        return null;
    }

    public ArrayList<JednakostranicniTrougao> createT(int n){
        ArrayList<JednakostranicniTrougao> trouglovi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trouglovi.add(new JednakostranicniTrougao(i+1));
        }
        return trouglovi;
    }

    public ArrayList<Pravougaonik>createP(int n){
        ArrayList<Pravougaonik>pravougaonici = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pravougaonici.add(new Pravougaonik(i+1, i+2));
        }
        return pravougaonici;
    }

    public ArrayList<Figura>createFigures(int nTrouglova, int nPravougaonika){
        ArrayList<Figura>figure = new ArrayList<>();
        for (int i = 0; i < nTrouglova; i++) {
            figure.add(new JednakostranicniTrougao(i+1));
        }
        for (int i = 0; i < nPravougaonika; i++) {
            figure.add(new Pravougaonik(i+1, i+2));
        }
        return figure;
    }


}
