package p14_09_2023.zadatak2;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> visitedPages;

    public History() {
        this.visitedPages = new ArrayList<>();
    }

    public void openPage(HistoryPage pageAdd){
        this.visitedPages.add(pageAdd);
    }
    public void deletePage(String link){
        for (int i = 0; i < visitedPages.size(); i++) {
            if(visitedPages.get(i).getLink().equals(link))
                visitedPages.remove(visitedPages.get(i));
        }
    }

    public void deleteCookies(String link){
        for (int i = 0; i < visitedPages.size(); i++) {
            if(visitedPages.get(i).getLink().equals(link))
                visitedPages.get(i).deleteCookies();
        }
    }

    public void deleteHistory(){
        this.visitedPages.clear();
    }
    public void saveCredential(String name, String username, String password){
        for (int i = 0; i < visitedPages.size(); i++) {
            if(visitedPages.get(i).getName().equals(name))
                visitedPages.get(i).saveCredentials(username, password);
        }
    }

    public void seeHistory(){
        for (int i = 0; i < visitedPages.size(); i++) {
            System.out.println(visitedPages.get(i).getName());
        }
    }

    public void deleteAllCookies(){
        for (int i = 0; i < visitedPages.size(); i++) {
            visitedPages.get(i).deleteCookies();
        }
    }

    public void deleteCookiesLastHour(int hour, int min){
        for (int i = 0; i < visitedPages.size(); i++) {
            if(visitedPages.get(i).getHour()==hour-1 && visitedPages.get(i).getMin()>min || visitedPages.get(i).getHour()==hour && visitedPages.get(i).getMin()<min)
                visitedPages.remove(visitedPages.get(i));

        }
    }
}
