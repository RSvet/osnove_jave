package d19_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
/*
U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
 */

        PlaninarskiDom dom = new PlaninarskiDom("Orlovo gnezdo", 2017);
        dom.uclani(new Alpinista(123, "Marko Petkovic", 20));
        dom.uclani(new Alpinista(963, "Petar Ilic", 5));
        dom.uclani(new Alpinista(496, "Nenad Markovic", 15));
        dom.uclani(new RekreativniPlaninar(456, "Stanko Maric", 10, "Juznobacki", 2600));
        dom.uclani(new RekreativniPlaninar(589, "Mario Stanic", 2, "Sumadijski", 1000));
        dom.uclani(new RekreativniPlaninar(657, "Nemanja Nikic", 5, "Sremski", 1900));

        dom.izbaci(589);

        Planina pl = new Planina("Golija", "Srbija", 1833);
        dom.stampaj();
        System.out.println("Broj uspesnih u usponu: "+dom.uspesnoPopeli(pl));


    }
}
