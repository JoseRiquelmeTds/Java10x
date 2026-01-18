package Begginer.Conditionals;

import java.util.Scanner;

public class SwitchCases {
    static void main() {
        Scanner input = new Scanner(System.in);
        int bookCode;
        System.out.println("TYPE A BOOK CODE TO SEE A MEMORABLE QUOTE: ");
        System.out.println("1 - Harry Potter and the Sorcerer Stone");
        System.out.println("2 - The Perks of Being a Wallflower");
        System.out.println("3 - Coraline");

        bookCode = input.nextInt();

        switch (bookCode) {
            case 1:
                System.out.println("Wingardium Leviosa!");
                break;
            case 2:
                System.out.println("In that moment I swear we were infinite");
                break;
            case 3:
                System.out.println("Cats don't have names");
                break;
            default:
                System.out.println("YOU ARE NOT EVEN TRYING, COMMON!");
                break;
        }


    }
}
