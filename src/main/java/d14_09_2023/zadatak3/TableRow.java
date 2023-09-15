package d14_09_2023.zadatak3;

import java.util.ArrayList;

public class TableRow {
    /*
    Kreirati klasu TableRow koja ima:
    ●	niz celija u telu tabele. Niz je niz stringova
    ●	metodu addRowCell, koja dodaje polje u niz
    ●	metodu za stampu koja stampa celije kao u primeru:
    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    ●	metodu printHTML, koja sluzi da stampa red u HTML formatu.
    red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
    primer:
    <tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
     */
    private ArrayList<String>cells = new ArrayList<>();

    public TableRow() {
        this.cells = new ArrayList<>();
    }
    public void addRowCell(String cell){
        this.cells.add(cell);
    }

    public void print(){
        for (int i = 0; i < cells.size(); i++) {
            if(i==0){
                System.out.print(cells.get(i));
                int cellLength = 15;
                while(cellLength>cells.get(i).length()){
                    System.out.print(" ");
                    cellLength-=1;
                }
                System.out.print("|");
            }
            else{

                System.out.print("\t"+cells.get(i));
                int cellLength = 15;
                while(cellLength>cells.get(i).length()){
                    System.out.print(" ");
                    cellLength-=1;
                }
                System.out.print("|");
            }
        }
        System.out.println();
    }

    public void printHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < cells.size(); i++) {
            System.out.print("<td>"+this.cells.get(i)+"</td>");
        }
        System.out.println("</tr>");
    }

    public boolean containsText(String text){
        for (int i = 0; i < cells.size(); i++) {
            if(cells.get(i).equals(text))
                return true;
        }
        return false;
    }
}
