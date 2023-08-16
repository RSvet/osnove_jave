package d15_08_2023;

public class vezbanjeSlack5 {
    public static void main(String[] args) {
        String imgName = "profile-image.png";
        int width = 1920;
        int height = 1080;
        double scale = 1.3;

        double resizedWidth = width*scale;
        double resizedHeight = height*scale;
        double originalImgSizeMb = 1.0*width*height/(1024*1024);
        double resizedImgSizeMb = resizedWidth*resizedHeight/(1024*1024);

        System.out.print("Original image: "+imgName+" ");
        System.out.println("Size: "+originalImgSizeMb+"Mb");
        System.out.println("Scale: "+scale);
        System.out.print("Resized image: resized-"+imgName+" ");
        System.out.println("Size: "+resizedImgSizeMb+"Mb");
        System.out.println("| Click here to Download image |");

    }
}
