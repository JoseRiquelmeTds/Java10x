package DataTypes;

import java.util.Locale;

public class NotPrimitiveData {
    static void main() {
        String bookName = "The Perks of being a Wallflower";

        System.out.println("bookName = " + bookName);
        
        bookName = bookName.toUpperCase();

        System.out.println("bookNameUpperCase = " + bookName);

        bookName = bookName.toLowerCase();

        System.out.println("bookNameLowerCase = " + bookName);
    }
}
