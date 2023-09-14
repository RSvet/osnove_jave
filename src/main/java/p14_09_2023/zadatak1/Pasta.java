package p14_09_2023.zadatak1;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public void dodajSastojak(Sastojak newSastojak){
        this.sastojci.add(newSastojak);
    }
    public double cenaPaste(){
        double suma = 0;
        for (Sastojak sastojak : this.sastojci) {
            suma += sastojak.getCena();
        }
        return suma;
    }

    public void stampa(){
        System.out.println("Pasta je sa sastojcima: ");
        for (Sastojak sastojak : sastojci) {
            sastojak.stampaj();
        }
        System.out.println("Cena paste "+this.cenaPaste()+" din.");
    }

    public void obrisiSastojak(String nazivSastojka){
        for (int i = 0; i < sastojci.size(); i++) {
            if(sastojci.get(i).getNaziv().equals(nazivSastojka))
                this.sastojci.remove(this.sastojci.get(i));
        }


    }
}
