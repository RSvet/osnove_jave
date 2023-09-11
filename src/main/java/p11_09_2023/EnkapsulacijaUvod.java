package p11_09_2023;

public class EnkapsulacijaUvod {
    public static void main(String[] args) {
        User m = new User("mail@kkk");
        m.setIme("Tanja");
        m.setEmail("tanja@gmail.com");
        m.setStarost(25);

        m.stampaj();

        User n = new User("Nemanja", "nem@mail.com", 33);
        n.stampaj();



    }


}
