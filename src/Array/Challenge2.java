package Array;

import java.io.FileOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Challenge2 {
    static void main() {
        Scanner scanner = new Scanner (System.in);
        String [] ninjaList = new String [10];
        int option;
        int actualPosition = 0;
        do {
            System.out.println("---- NINJA REGISTER 2.0 ----");
            System.out.println("Choose your option!");
            System.out.println("----------------------------");
            System.out.println("1- Register a new ninja");
            System.out.println("2- List all the ninjas on database");
            System.out.println("3- Stop the Execution");
            System.out.println("----------------------------");
            System.out.print("Choose: ");

            option = scanner.nextInt();
            scanner.nextLine();



            switch (option) {
                case 1:
                    System.out.println("----------------------------");
                    if (actualPosition == 10) System.out.println("THE MAX NUMBER OF NINJAS ARE REGISTERED");
                    else
                    {
                        System.out.print("Input the name of the new ninja: ");
                        ninjaList[actualPosition] = scanner.nextLine();
                        actualPosition++;
                        System.out.println("Ninja " + ninjaList[actualPosition-1] + " Was registered on position " + actualPosition);
                    }
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("All ninjas:");
                    for (int i = 0; i < actualPosition; i++) {
                        System.out.println("Ninja " + (i+1) + ": " + ninjaList[i]);
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------");
                    System.out.println("ENDING SYSTEM...");
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("THIS IS NOT A OPTION");
                    break;
            }
        } while (option != 3);



        scanner.close();
    }
}
