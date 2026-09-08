package library.model;
public abstract class libraryresource {
    private int resourceid;
    private String title;
    private String author;
    public static String libraryname = "Central University Library";
    private static int resourcecounter = 0;
    public libraryresource(int resourceid, String title, String author) {
        this.resourceid = resourceid;
        this.title = title;
        this.author = author;
        resourcecounter++;
    }
    public int getresourceid() {
        return resourceid;
    }
    public void setresourceid(int resourceid) {
        this.resourceid = resourceid;
    }
    public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String getauthor() {
        return author;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public static int gettotalresources() {
        return resourcecounter;
    }
    public abstract double calculatefine(int overduedays);
}
