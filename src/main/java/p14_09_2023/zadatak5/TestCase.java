package p14_09_2023.zadatak5;

import java.util.ArrayList;

public class TestCase {
    private String ID;
    private String naziv;
    private ArrayList<TestStep> testKoraci;

    public TestCase(String ID, String naziv) {
        this.ID = ID;
        this.naziv = naziv;
        this.testKoraci = new ArrayList<>();
    }

    public void addTestStep(TestStep test){
        this.testKoraci.add(test);
    }

    public int testStepFailed(){
        int counter = 0;
        for (int i = 0; i < testKoraci.size(); i++) {
            if(!testKoraci.get(i).validate())
                counter++;
        }
        return counter;
    }

    public String stanjeTestCase(){
       if(this.testStepFailed()==0)
       return "PASSED";

       else return "FAILED";

    }

    public void stampa(){
        System.out.println(this.ID+" - "+this.naziv);
        for (int i = 0; i < this.testKoraci.size(); i++) {
            this.testKoraci.get(i).stampa();
        }

        System.out.println(this.testKoraci.size()+" / "+this.testStepFailed());
        System.out.println("TEST CASE "+this.stanjeTestCase());
    }
}
