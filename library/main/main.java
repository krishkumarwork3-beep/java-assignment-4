package library.main;
import library.model.libraryresource;
import library.service.book;
import library.service.digitalresource;
import library.service.printable;
import library.util.inputvalidator;
public class main {
    public static void main(String[] args) {
        libraryresource[] resources = {
            new book(1, "Introduction to Algorithms", "Thomas Cormen"),
            new digitalresource(2, "Data Science E-Book", "Andrew Ng"),
            new book(3, "Clean Code", "Robert Martin"),
            new digitalresource(4, "Machine Learning Notes", "Tom Mitchell"),
            new book(5, "Operating System Concepts", "Abraham Silberschatz")
        };
        int[] overduedays = {5, 10, 0, 7, 3};
        double totalfine = 0.0;
        for (int i = 0; i < resources.length; i++) {
            libraryresource resource = resources[i];
            int days = overduedays[i];
            if (inputvalidator.validateresourceid(resource.getresourceid())
                    && inputvalidator.validatefinedays(days)) {
                if (resource instanceof printable) {
                    ((printable) resource).printdetails();
                }
                double fine = resource.calculatefine(days);
                System.out.println("Overdue Days   : " + days);
                System.out.println("Fine Amount    : Rs. " + fine);
                totalfine += fine;

            } else {
                System.out.println("Invalid data for Resource ID: " + resource.getresourceid());
            }
        }
        System.out.println("Total Resources Created: " + libraryresource.gettotalresources());
        System.out.println("Total Fine of All Overdue Resources: Rs. " + totalfine);
    }
}