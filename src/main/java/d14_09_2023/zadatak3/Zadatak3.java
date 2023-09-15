package d14_09_2023.zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {
        TableHeader header = new TableHeader();
        header.addHeaderCell("Ime");
        header.addHeaderCell("Prezime");
        header.addHeaderCell("Godina");


        TableRow row = new TableRow();
        TableRow row2 = new TableRow();
        TableRow row3 = new TableRow();
        TableRow row4 = new TableRow();
        row.addRowCell("Milan");
        row.addRowCell("Simic");
        row.addRowCell("36");
        row2.addRowCell("Tamara");
        row2.addRowCell("Peric");
        row2.addRowCell("27");
        row3.addRowCell("Milica");
        row3.addRowCell("Markovic");
        row3.addRowCell("27");



        Table tabela =new Table(2);
        tabela.setHeader(header);
        tabela.addRow(row);
        tabela.addRow(row2);
        tabela.addRow(row3);
        tabela.addRow(row4);


        tabela.printHTMLTable();
        System.out.println();

        //tabela.filter("Simic");

        tabela.printTable(2);
        System.out.println();

        tabela.printPaginator();
    }
}
