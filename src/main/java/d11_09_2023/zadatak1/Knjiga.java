package d11_09_2023.zadatak1;

public class Knjiga {
    /*
     Kreirati klasu Knjiga koji ima:
    -ISBN
    -naziv
    -godina izdanja
    -autor
    -konstuktore koje mislite da su vam potrebni
    -gettere i settere za atribute
    -metodu print koja stampa u formatu (izbegavati dupliranje koda):
    (ISBN)
    (naziv) - (godina izdanja)
    autor: (ime autora) (prezime autora)
     */

    private String ISBN;
    private String naziv;
    private int godina;
    private Autor autor;
    public Knjiga(){}
    public Knjiga(String ISBN, String naziv, int godina, Autor autor){
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godina = godina;
        this.autor = autor;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){return this.ISBN;}
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public String getNaziv(){return this.naziv;}

    public void setGodina(int godina){
        this.godina = godina;
    }
    public int getGodina(){return this.godina;}

    public void setAutor(Autor autor){this.autor = autor;}
    public Autor getAutor(){return this.autor;}

    public void print(){
        System.out.println(this.ISBN);
        System.out.println(this.naziv + " - " + this.godina);
        if(this.autor != null){
            System.out.print("Autor: ");
            this.autor.print();
        }
    }
}
