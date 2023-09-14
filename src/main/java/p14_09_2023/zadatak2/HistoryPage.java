package p14_09_2023.zadatak2;

public class HistoryPage {
    private String name;
    private String link;
    private int hour;
    private int min;
    private String username;
    private String password;

    public HistoryPage(String name, String link, int hour, int min) {
        this.name = name;
        this.link = link;
        this.hour = hour;
        this.min = min;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void saveCredentials(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void deleteCookies(){
        this.username = null;
        this.password = null;
    }
    public void print(){
        System.out.println(this.hour+"-"+this.min+" - "+this.name+"..."+this.link+(this.username!=null && this.password!= null?"*":""));
    }


}
