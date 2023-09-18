package p18_09_2023.zadatak3;

public abstract class Figura {
    public Figura() {
    }

    public abstract double povrsina();
    public abstract int obim();

    public void stampaj(){
        System.out.println("Povrsina: "+this.povrsina());
        System.out.println("Obim: "+this.obim());
    }
}
