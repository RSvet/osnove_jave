package d14_09_2023.zadatak3;

import java.util.ArrayList;

public class TableHeader {
    /*
    Kreirati klasu TableHeader koja ima:
    ●	niz celija u headeru tabele. Niz je niz stringova
    ●	metodu addHeaderCell, koja dodaje polje u niz
    ●	metodu za stampu koja stampa celije kao u primeru:
    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    (Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
    ●	metodu printHTML, koja sluzi da stampa header u HTML formatu.
    header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
    primer:
    <tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
     */

    private ArrayList<String>cells;

    public TableHeader() {
        this.cells = new ArrayList<>();
    }

    public void addHeaderCell(String cell){
        this.cells.add(cell);
    }

    public void print (){

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
            System.out.print("<th>"+this.cells.get(i)+"</th>");
        }
        System.out.println("</tr>");

    }
}
