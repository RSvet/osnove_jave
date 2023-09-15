package d14_09_2023.zadatak2;
import java.util.ArrayList;
import java.util.Arrays;

public class Kombinacija {
    /*
    Kreirati klasu Kombinacija koja ima:
    ●	id kombinacije (String)
    ●	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
    ●	konstruktor koji prima id i 7 brojeva koji se u konstruktoru dodaju u niz.
    ●	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
    ●	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
    ○	Zaglavlje metode je:
    ■	public boolean daLiJeIstaKombinacija( Kombinacija k)
    ○	metoda vraca true ako su svi elementi na istim pozicija isti
    ■	npr: this [0] == k [0], this [1] == k [1] ….
    ●	metodu za stampu koja stampa podatke u formatu
    ID: id kombinacije
    brojevi: 1, 3, 5, 14, 15, 21, 23
     */
    private String id;
    ArrayList<Integer>brojevi;

    public Kombinacija(String id, int broj1, int broj2, int broj3, int broj4, int broj5, int broj6, int broj7) {
        this.id = id;
        this.brojevi = new ArrayList<>(Arrays.asList(broj1, broj2, broj3, broj4, broj5, broj6, broj7));
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }



    public boolean daLiJeIstaKombinacija(Kombinacija k){
        for (int i = 0; i < brojevi.size(); i++) {
            if(this.brojevi.get(i)!=k.brojevi.get(i))
                return false;
        }
        return true;
    }

    public void stampa(){
        System.out.println("ID: "+this.id);
        System.out.print("Brojevi: ");
        for (int i = 0; i < brojevi.size(); i++) {
            if(i == brojevi.size()-1){
                System.out.println(brojevi.get(i));
            }
            else
            System.out.print(brojevi.get(i)+", ");
        }
    }
}
