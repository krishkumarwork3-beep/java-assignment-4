package library.service;
import library.model.libraryresource;
public class digitalresource extends libraryresource implements printable {
    public digitalresource(int resourceid, String title, String author) {
        super(resourceid, title, author);
    }
    public double calculatefine(int overduedays) {
        return overduedays * 2.0;
    }

    public void printdetails() {
        System.out.println("Resource Type: Digital Resource");
        System.out.println("Resource ID: " + getresourceid());
        System.out.println("Title: " + gettitle());
        System.out.println("Author: " + getauthor());
        System.out.println("Library: " + libraryresource.libraryname);
    }
}