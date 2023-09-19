package d18_09_2023.zadatak1;

public class AudioControl extends Control {
    /*

Kreirati klasu AudioControl koja nasledjuje klasu Control i
●	gettere, settere i konstruktore
●	ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
●	implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100

     */

    private boolean pojacaj;

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public boolean getPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if(this.pojacaj){
            if(player.getJacinaZvuka()<100)
                player.setJacinaZvuka(player.getJacinaZvuka()+1);
            else player.setJacinaZvuka(100);
        }
        else{
            if(player.getJacinaZvuka()>0)
                player.setJacinaZvuka(player.getJacinaZvuka()-1);
            else player.setJacinaZvuka(0);
        }
    }
}
