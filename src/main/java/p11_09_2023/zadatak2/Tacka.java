package p11_09_2023.zadatak2;

public class Tacka {
    /*
    Za klasu Tacka, koja ima privatne atribute:
        x - x koordinata
        y - y koordinata
        Javne metode:
        metodu stampaj
        imamo difoltni konstruktor
        imamo konstuktor koji prima obe koordinate za kreiranje objekta
        geter za x
        geter za y
        seter za x
        seter za y
     */

    private int x;
    private int y;

    public void stampaj(){
        System.out.println("Koordinate: x="+this.x+", y="+this.y);
    }

    public Tacka(){}

    public Tacka(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x =x;
    }
    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y =y;
    }
    public int getY(){
        return this.y;
    }




}
