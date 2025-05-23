import java.util.*;
class LibraryBook {
    String bookTitle;
    String bookAuthor;
    String pubYear;
    int id;
    double price;
    String availability;

    LibraryBook(int id, String bookTitle, String bookAuthor, String pubYear, double price, String availability) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.pubYear = pubYear;
        this.price = price;
        this.availability = availability;
    }

    void registerBook() {
        System.out.println(bookTitle + " has been successfully registered.");
    }

    void removeBook() {
        System.out.println(bookTitle + " has been removed.");
    }

    void showBookInfo() {
        System.out.println("Title: " + bookTitle + ", Author: " + bookAuthor + ", Year: " + pubYear);
        System.out.println("Book ID: " + id + ", Cost: " + price + " Taka");
    }

    void checkBookStatus() {
        System.out.println("Status inquiry for book: " + bookTitle + " [ID: " + id + "]");
    }
}

class Librarian {
    int staffId;
    String staffName;

    Librarian(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    void AddBook(String title) {
        System.out.println(staffName + " is adding the book titled: " + title);
    }

    boolean confirmUser(int id) {
        System.out.println("Checking user ID: " + id + " for membership validation.");
        return true;
    }

    void initiateOrder() {
        System.out.println(staffName + " is placing a book order.");
    }

    void finalizeSale() {
        System.out.println(staffName + " has completed the book sale.");
    }
}

class BookPublisher {
    int publisherId;
    String publisherName;
    String location;
    int contactNumber;

    BookPublisher(int publisherId, String publisherName, String location, int contactNumber) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    void addNewPublisher() {
        System.out.println("Adding publisher: " + publisherName);
    }

    void editPublisher() {
        System.out.println("Updating details for publisher: " + publisherName);
    }

    void removePublisher() {
        System.out.println("Removing publisher: " + publisherName);
    }

    void checkOrderUpdate() {
        System.out.println("Retrieving order update for: " + publisherName);
    }
}

class Member {
    int memberId;
    String memberName;
    String memberAddress;
    int memberPhone;

    Member(int memberId, String memberName, String memberAddress, int memberPhone) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberPhone = memberPhone;
    }

    void returnBook() {
        System.out.println(memberName + " [ID: " + memberId + "] is returning a book.");
    }

    int calculateFine(int delayDays) {
        int totalFine = delayDays * 18;
        System.out.println("Late by " + delayDays + " days. Fine due: " + totalFine + " Taka");
        return totalFine;
    }

    void registerUser() {
        System.out.println("Registering new member: " + memberName + " [ID: " + memberId + "]");
    }

    void removeUser() {
        System.out.println("Removing member: " + memberName);
    }

    void modifyUserDetails() {
        System.out.println("Updating profile for: " + memberName);
    }

    void buyBook() {
        System.out.println(memberName + " is purchasing a book.");
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook(101, "Java Concepts", "Dr. Ahmed", "2023", 750.0, "Available");
        lb.showBookInfo();

        Librarian s = new Librarian(1001, "Mr. Reza");
        s.AddBook("Java Concepts");

        BookPublisher bp = new BookPublisher(555, "TechBooks Ltd.", "45,Dhaka", 12345566);
        bp.checkOrderUpdate();

        Member m = new Member(88901, "Fatema", "12/B,Mymenshing", 1234567789);
        m.buyBook();
        m.calculateFine(15);
    }
}
