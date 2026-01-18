package Begginer.Conditionals;

import java.util.Scanner;

public class Scanners {

    static void main() {
        Scanner input = new Scanner(System.in);
        long bookCode;
        double bookValue;
        String bookName;
        boolean isRent;
        int daysRent = -1;

        System.out.println("---- ULTIMATE BOOK REGISTER ----");
        System.out.print("Please input the book name: ");
        bookName = input.nextLine();
        System.out.print("Please input the book code: ");
        bookCode = input.nextLong();
        System.out.print("Please input the book value: ");
        bookValue = input.nextDouble();
        System.out.print("Is the book rent? ");
        isRent = input.nextBoolean();

        if (isRent)
        {
            System.out.print("Please input how many days is the book rent: ");
            daysRent = input.nextInt();
        }

        System.out.println("---------------------");
        System.out.println("Book: " + bookName.toUpperCase());
        System.out.println("Code: " + bookCode);
        System.out.println("Value: " + bookValue);
        System.out.println(isRent ? "Is rent for " + daysRent : "Is available to rent");

    }

}
