import java.util.Scanner;
class LibraryBook {
    private static int totalBooksIssued = 0;
    public static void issueBook(int count) {
        totalBooksIssued += count;
        System.out.println("Total number of books issued: " + totalBooksIssued);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the number of books to issue: ");
        int n = sc.nextInt();
        LibraryBook.issueBook(n);
    }
}
