package d15_08_2023;

public class vezbanjeSlack6 {
    public static void main(String[] args) {
        String videoName= "Chase & Status - Mixed Emotions";
        int numFramesPerSec = 30;
        int videoLengthInSeconds= 224;
        int width = 1920;
        int height = 1080;

        String resolution = width+ " x "+height;
        int timeInMin = videoLengthInSeconds/60;
        int timeRemainedInSec = videoLengthInSeconds - timeInMin*60;
        String timeOfTheVideo = timeInMin+":"+timeRemainedInSec;
        double minNetworkSpeed = 1.0*width*height/(1024*1024)*numFramesPerSec;

        System.out.println("*************************************************************************");
        System.out.println(videoName);
        System.out.println(timeOfTheVideo+"   <| | | | |");
        System.out.println("Number of frames per second: "+numFramesPerSec);
        System.out.println("Resolution: "+resolution);
        System.out.println("Minimal network speed: "+(int)minNetworkSpeed+"Mb/s");


    }
}
