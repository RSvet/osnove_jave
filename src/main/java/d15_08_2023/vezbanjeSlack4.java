package d15_08_2023;

public class vezbanjeSlack4 {
    public static void main(String[] args) {
        String imgName="profile-image.log";
        int width = 1920;
        int height = 1080;

        String resolution = width+ " x "+height;
        int imgSizeKb = width*height/1024;
        double imgSizeMb = 1.0*width*height/(1024*1024);

        System.out.println("File: "+imgName);
        System.out.println("Resolution: "+resolution);
        System.out.println("Size(kb): "+imgSizeKb);
        System.out.println("Size(Mb): "+imgSizeMb);



    }
}
