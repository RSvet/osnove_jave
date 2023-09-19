package d18_09_2023.zadatak1;

public class TimeControl extends Control{
    /*
    Kreirati klasu TimeControl koja nasledjuje klasu Control i
●	konstruktore
●	ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
●	implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
     */

    private boolean premotaj;

    public TimeControl(boolean premotaj) {
        this.premotaj = premotaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if(this.premotaj){
            if(player.getDuzina()-15>= player.getTrenutnoVreme())
                player.setTrenutnoVreme(player.getTrenutnoVreme()+15);
            else player.setTrenutnoVreme(player.getDuzina());
        }
        else {
            if(player.getTrenutnoVreme()<15){
                player.setTrenutnoVreme(0);
            }
            else player.setTrenutnoVreme(player.getTrenutnoVreme()-15);
        }
    }


}
