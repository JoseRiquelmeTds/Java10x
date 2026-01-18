package Array;

import java.util.Scanner;

public class Array {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String [] books = new String[4];

        books[0] = scanner.nextLine();
        books[1] = scanner.nextLine();
        books[2] = scanner.nextLine();

        System.out.println("The books in the shelf are: ");
        for (int i = 0; i < books.length; i++)
        {
            System.out.println("Book " + i + ": " + books[i]);
        }


    }
}
