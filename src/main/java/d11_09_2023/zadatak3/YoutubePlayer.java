package d11_09_2023.zadatak3;

public class YoutubePlayer {
 private Video video;
 private int kvalitet;
 private String rezim;
 private int zvuk;
 private int trenutnoVreme;

 public YoutubePlayer(){
     this.zvuk =  75;
     this.kvalitet = 144;
     this.rezim = "mini player";
 }

 public Video getVideo() {
     return this.video;
 }
 public int getKvalitet() {
     return this.kvalitet;
 }
 public String getRezim(){
     return this.rezim;
 }
 public int getZvuk(){
     return this.zvuk;
 }
 public int getTrenutnoVreme(){
     return this.trenutnoVreme;
 }

 public void ucitajVideo(Video video){
     this.video = video;
     this.trenutnoVreme = 0;
     video.pogledaj();
 }
 public void pojacaj(){
     if(this.zvuk <=90)
     this.zvuk+=10;
     else this.zvuk = 100;
 }
 public void smanji(){
     if(this.zvuk>=10)
         this.zvuk -=10;
     else this.zvuk = 0;
 }

 public void postaviKvalitet(int brzinaInterneta){
  if(brzinaInterneta < 2)
      this.kvalitet = 144;
  else if (brzinaInterneta >=2 && brzinaInterneta<4)
      this.kvalitet = 240;
  else if (brzinaInterneta >=4 && brzinaInterneta < 6){
      this.kvalitet = 360;
  }
  else if (brzinaInterneta >=6 && brzinaInterneta < 8){
      this.kvalitet = 720;
  }
  else this.kvalitet = 1080;
 }

 public void aktivirajMiniPlayerMod(){
     this.rezim =  "mini player";
 }
 public void aktivirajBioskopskiMod(){
     this.rezim =  "bioskopski";
 }
 public void aktivirajPrekoCelogEkranaMod(){
     this.rezim = "preko celog ekrana";
 }
 public void premotajUnapred(){
    if(this.video != null){
         if(this.video.getDuzina() > this.trenutnoVreme + 10)
             this.trenutnoVreme += 10;
         else this.trenutnoVreme = this.video.getDuzina();
     }
    else System.out.println("Video nije ucitan! Ucitajte video.");
 }
 public void premotajUnazad(){
     if(this.video != null){
         if(this.trenutnoVreme >= 10)
             this.trenutnoVreme -= 10;
         else this.trenutnoVreme = 0;
     }
     else System.out.println("Video nije ucitan! Ucitajte video.");
 }
 public void iscrtajZvuk(){
     if (this.zvuk == 0)
         System.out.print("</");
     else{
         int brojCrtica = this.zvuk / 10;

         System.out.print("<:");
         for (int i = 0; i < brojCrtica; i++) {
             System.out.print("|");
         }
     }
 }

 public void iscrtajRezim(){
     if(this.rezim.equals("mini player"))
         System.out.println("[]");
     else if (this.rezim.equals("bioskopski"))
         System.out.println("[..]");
     else System.out.println("[||||]");
 }

 public void iscrtajTrenutnoVreme(){
     if(this.video != null){
         int minut = this.trenutnoVreme/60;
         int sekund = this.trenutnoVreme%60;
         int minUkupno = this.video.getDuzina()/60;
         int sekUkupno = this.video.getDuzina()%60;
         String output = String.format("%02d:%02d", minut, sekund);
         String outputUkupno = String.format("%02d:%02d", minUkupno, sekUkupno);
         System.out.println(output + " / "+ outputUkupno);
     }
     else System.out.println("Video nije ucitan! Ucitajte video.");

 }
 public void iscrtajTimeline(){
     if(this.video != null){
         int zvezdice = this.trenutnoVreme*100/this.video.getDuzina();
         for (int i = 0; i < 100; i++) {
             if(i <zvezdice)
                 System.out.print("*");
             else System.out.print(".");
         }
     }
   else System.out.println("Video nije ucitan! Ucitajte video.");

 }
 public void iscitaj(){
     if(this.video != null){
         this.iscrtajTrenutnoVreme();
         System.out.print("Zvuk ");
         this.iscrtajZvuk();
         System.out.println();
         System.out.print("Timeline: ");
         this.iscrtajTimeline();
         System.out.println();
         System.out.println("Kvalitet: "+this.kvalitet);
         System.out.println("Rezim: "+this.rezim);
         System.out.println(this.video.getNaziv());
         System.out.println("Likes: "+this.video.getLajkovi()+" | Dislikes: "+this.video.getDislajkovi());
         System.out.println(this.video.getPregledi() + " Pregleda");
     }
     else System.out.println("Video nije ucitan! Ucitajte video.");

 }
 public String share(){
     if(this.video != null){
         return "https://youtu.be/"+this.video.getId();
     }
     else return "Video nije ucitan";

 }


}