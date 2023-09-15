package d14_09_2023.zadatak3;

import java.util.ArrayList;

public class Table {
    /*
    Kreirati klasu Table koja ima:
    ●	header tabele
    ●	niz redova. Niz je niz TableRow elementa
    ●	setter za header
    ●	metodu za dodavanje novog reda u tablu
    ●	metodu za stampu koja stampa header i redove tabele
    ●	metodu za stampu HTML-a tabele.Primer
    <table>
    <thead>
    <tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    </thead>
    <tbody>
    <tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
    <tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
    <tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
    </tbody>
    </table>
     */

    private int rowNumber;
    private TableHeader header;
    private ArrayList<TableRow> rows;


    public Table(int rowNumber) {
        this.rowNumber = rowNumber;
        this.rows = new ArrayList<>();
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public void addRow(TableRow row){
        this.rows.add(row);
    }




    public void printHTMLTable(){
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < rows.size(); i++) {
            this.rows.get(i).printHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");

    }
    /*
    (DOPUNA 1)
    U klasi TableRow dodajte metodu koja proverava da li se neki prosledjeni tekst sadrzi u nekoj celiji tog reda. Metoda vraca true ako postoji

    U klasi Table dodajte metodu filter, koja sluzi da filtrira redove tabele u odnosu na prosledjeni tekst. Metoda stampa tabelu, ali samo redove koji sadrze trazeni tekst.
    Primer izvrsenja: za filter “Milan” stampa se

    First Name 	|	Last Name 	| 	Age	|
    Milan			Jovanovic		27
     */

    public void filter(String text){
        this.header.print();
        for (int i = 0; i < rows.size(); i++) {
            if(rows.get(i).containsText(text)){
                this.rows.get(i).print();
            }
        }
    }

    /*

(DOPUNA 2)
U klasi Table dodajte atribut broj redova po strani (najcesce se koristi 5, 10, 25 ili 100 cisto da navedem neki primer).
Dodati metodu koja stampa paginator (Sta je paginator?). Paginator stampa koliko strana imamo za redove u tabeli.

Npr: ako imamo u tabeli 50 redova i broj redova po strani je 10 paginator se stampa
| 1 | 2 | 3 | 4 | 5

Zatim izmenite metodu za stampu tako da prima parametar redni broj strane na osnovu koje tabela prikazuje samo elemente te strane. Naravno maksimalno broj elemenata po strani.

 */
    public void printTable(int pageNum){
        this.header.print();
        int numPages = this.rows.size()%this.rowNumber==0?this.rows.size()/this.rowNumber:this.rows.size()/this.rowNumber+1;
        int index=0;

        for (int i = 1; i <= numPages; i++) {
            for (int j = 1; j <= this.rowNumber; j++) {
                if(i == pageNum && index < this.rows.size()){
                    this.rows.get(index).print();
                }
                index++;
            }

        }

    }

    public void printPaginator(){
        System.out.println("Broj redova po strani: "+this.rowNumber);
        int numPages = this.rows.size()%this.rowNumber==0?this.rows.size()/this.rowNumber:this.rows.size()/this.rowNumber+1;
        for (int i = 1; i <=numPages; i++) {
            System.out.print("| "+i+" ");
        }
        System.out.println("|");
    }


}
