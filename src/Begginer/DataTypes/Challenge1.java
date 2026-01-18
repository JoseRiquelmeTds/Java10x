package Begginer.DataTypes;

public class Challenge1 {
    static void main() {
        String ninjaName1 = "Naruto";
        String ninjaName2 = "Hidan";
        String ninjaName3 = "Jiraya";

        int ninjaAge1 = 11;
        int ninjaAge2 = 12123;
        int ninjaAge3 = 55;

        String missionName1 = "Search for a dog";
        String missionName2 = "Kill Assuma";
        String missionName3 = "Do research for your book";

        char missionDiff1 = 'A';
        char missionDiff2 = 'S';
        char missionDiff3 = 'B';

        boolean missionComplete1 = false;
        boolean missionComplete2 = false;
        boolean missionComplete3 = false;

        if (ninjaAge1 >= 15 || missionDiff1 == 'C' || missionDiff1 == 'D')
        {
            missionComplete1 = true;
        }

        if (ninjaAge2 >= 15 || missionDiff2 == 'C' || missionDiff2 == 'D')
        {
            missionComplete2 = true;
        }

        if (ninjaAge3 >= 15 || missionDiff3 == 'C' || missionDiff3 == 'D')
        {
            missionComplete3 = true;
        }


        System.out.println("NINJA: " + ninjaName1);
        System.out.println("AGE: " + ninjaAge1);
        System.out.println("MISSION: " + missionName1);
        System.out.println("MISSION DIFFICULT: " + missionDiff1);
        System.out.println("MISSION COMPLETE: " + (missionComplete1 ? "YES" : "NO"));
        System.out.println("--------------------------------------");

        System.out.println("NINJA: " + ninjaName2);
        System.out.println("AGE: " + ninjaAge2);
        System.out.println("MISSION: " + missionName2);
        System.out.println("MISSION DIFFICULT: " + missionDiff2);
        System.out.println("MISSION COMPLETE: " + (missionComplete2 ? "YES" : "NO"));
        System.out.println("--------------------------------------");

        System.out.println("NINJA: " + ninjaName3);
        System.out.println("AGE: " + ninjaAge3);
        System.out.println("MISSION: " + missionName3);
        System.out.println("MISSION DIFFICULT: " + missionDiff3);
        System.out.println("MISSION COMPLETE: " + (missionComplete3 ? "YES" : "NO"));
        System.out.println("--------------------------------------");



    }
}
