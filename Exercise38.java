//9. 📚 Library System
//Create a Book class with private fields: title, author, availableCopies.
//Add a borrowBook() method that decreases the available copies (but not below 0).
//Add a returnBook() method that increases it.
//Add getter methods to check the current book status.

package JavaEncapsulations.Exercise8;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Book b1 = new Book("title1","banuka",4);
        Scanner input = new Scanner(System.in);

        System.out.println("how many books you want to return : ");
        int y = input.nextInt();
        b1.returnBooks(y);

        System.out.println("how many books you want to borrow : ");
        int x = input.nextInt();
        b1.borrowBooks(x);


        b1.bookStatus();
    }
}
