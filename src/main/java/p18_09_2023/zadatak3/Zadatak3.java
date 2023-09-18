package p18_09_2023.zadatak3;

import p15_09_2023.zadatak1.Profesor;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(4);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(5);

        Pravougaonik p1 = new Pravougaonik(3,4);
        Pravougaonik p2 = new Pravougaonik(2,6);
        Pravougaonik p3 = new Pravougaonik(4,6);


        ArrayList<Figura>figure = new ArrayList<>();
        figure.add(trougao1);
        figure.add(trougao2);
        figure.add(p1);
        figure.add(p2);
        figure.add(p3);

        double sumPovrsina=0;
        int sumObim = 0;
        for (int i = 0; i < figure.size(); i++) {
            sumPovrsina += figure.get(i).povrsina();
            sumObim += figure.get(i).obim();
            figure.get(i).stampaj();

        }

        System.out.println("Suma povrsina za figure: "+sumPovrsina);
        System.out.println("Suma obima za figure: "+sumObim);


        FigureGenerator generator = new FigureGenerator();

        Figura f1 = generator.generate("trougao");
        Figura pr1 = generator.generate("pravougaonik");

       ArrayList<Figura>nizFigura = generator.createFigures(3,2);
        for (int i = 0; i < nizFigura.size(); i++) {
            nizFigura.get(i).stampaj();
        }

    }
}
