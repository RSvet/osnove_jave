package d15_08_2023;

public class vezbanjeSlack7 {
    public static void main(String[] args) {
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%.
//        Program od informacija cuva:
//        Naziv telefona
//        Kapacitet baterije u mAh (miliamper sat)
//        Trenutna napunjenost baterije u % (procentima)
//        Struja punjenja u mA (miliamper)
//        Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.

//        Primer izvrsenja:
//        Iphone 11 pro max
//        Kapacitet baterije: 3000mAh
//        Baterija trenutno na 20%
//        Struja punjenja 1000mA
//        Procenjeno vreme punjenja je 2.4h.


        String phoneType = "Iphone 11 pro max";
        int batteryCapacity = 3000;
        int chargedPercent = 20;
        int chargerRate = 1000;

        int chargedInmAh = batteryCapacity * chargedPercent /100;
        double timeToFullyCharge = (batteryCapacity - chargedInmAh)*1.0/chargerRate;

        System.out.println(phoneType);
        System.out.println("Kapacitet baterije: "+batteryCapacity+"mAh");
        System.out.println("Baterija trenutno na "+chargedPercent+"%");
        System.out.println("Struja punjenja "+chargerRate+"mA");
        System.out.println("Procenjeno vreme punjenja je "+timeToFullyCharge+"h");


    }
}
