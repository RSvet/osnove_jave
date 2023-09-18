package p18_09_2023.zadatak3;

public class JednakostranicniTrougao extends Figura {
    private int a;

    public JednakostranicniTrougao(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a*Math.sqrt(3)/4;
    }

    @Override
    public int obim() {
        return 3*a;
    }
}
