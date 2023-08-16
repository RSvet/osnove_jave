package d15_08_2023;

public class vezbanjeSlack2 {
    public static void main(String[] args) {
        String fileName = "profile-image.png";
        int fileSize = 7;
        int fileDownloaded = 2;

        int downloadPercentage = fileDownloaded*100/fileSize;

        System.out.println(fileName +" "+ fileSize+"Mb/"+fileDownloaded+"Mb");
        System.out.println("*****************************");
        System.out.println("***********"+downloadPercentage+"%");
        System.out.println("*****************************");

    }
}
