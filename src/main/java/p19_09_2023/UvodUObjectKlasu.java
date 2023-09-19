package p19_09_2023;

public class UvodUObjectKlasu {
    public static void main(String[] args) {
        User user = new User("123","Pera Peric", "mail@mai.com");


        Object pr = new User("456","Marko Milic", "m@dd.com");

        Osoba mladen = new User("741","Mladen mmmm", "dd@ddd");

        if(mladen instanceof User){
            User pomocna = (User) mladen;
            pomocna.setFullName("kkkk");
        }


    }
}
