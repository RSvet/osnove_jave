package p14_09_2023.zadatak4;

public class InstagramTag {
    private int x;
    private int y;
    private InstagramUser taggedUser;

    public InstagramUser getTaggedUser(){
        return this.taggedUser;
    }

    public InstagramTag(int x, int y, InstagramUser taggedUser) {
        this.x = x;
        this.y = y;
        this.taggedUser = taggedUser;
    }


}
