package p19_09_2023;

public class User extends Osoba {
    private String fullName;
    private String email;


    public User(String id, String fullName, String email) {
        super(id);
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
