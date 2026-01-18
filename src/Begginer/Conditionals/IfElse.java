package Begginer.Conditionals;

public class IfElse {
    static void main()
    {
        String bookName = "The Perks of Being a WallFlower";
        String bookRank;
        double bookValue = 50.0;
        double popularity = 4.5; // 1-5 stars

        if (popularity > 5 || popularity < 1)
        {
            System.out.println("THIS BOOK HAVE AN ERROR");
        }
        else
        {
            if (popularity >= 4 && bookValue > 40)
            {
                bookRank = "Gold";
            }
            else if (popularity >= 4 || bookValue > 40)
            {
                bookRank = "Silver";
            }
            else
            {
                bookRank = "Cooper";
            }

            System.out.println(bookName.toUpperCase() + " HAS THE RANK " + bookRank.toUpperCase());
        }


    }
}
