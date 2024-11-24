package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DBingo
{
    public static boolean checkCard (String[][] markedCard)
    {
        int horizontalCount = 0;
        int verticalCount = 0;
        int firstDiagonalCount = 0;
        int secondDiagonalCount = 0;
        for (int i = 0; i < markedCard.length; i++)
        {
            for (int j = 0; j < markedCard.length; j++)
            {
                if (markedCard[i][j] != null && markedCard[i][j].equalsIgnoreCase("o"))
                {
                    horizontalCount++;
                }
                if (markedCard[j][i] != null && markedCard[j][i].equalsIgnoreCase("o"))
                {
                    verticalCount++;
                }
            }
        }
        for (int i = 0; i < markedCard.length; i++)
        {
            if (markedCard[i][i] != null && markedCard[i][i].equalsIgnoreCase("o"))
            {
                firstDiagonalCount++;
            }
            if
            (
                markedCard[markedCard.length - i - 1][markedCard.length - i - 1] != null &&
                markedCard[markedCard.length - i - 1][markedCard.length - i - 1].equalsIgnoreCase("o")
            )
            {
                secondDiagonalCount++;
            }
        }
        System.err.println("HC " + horizontalCount);
        System.err.println("VC " + verticalCount);
        System.err.println("FD " + firstDiagonalCount);
        System.err.println("SD " + secondDiagonalCount);
        if
        (
            horizontalCount == markedCard.length || verticalCount == markedCard.length ||
            firstDiagonalCount == markedCard.length || secondDiagonalCount == markedCard.length
        )
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cardSize = Integer.parseInt(input.nextLine());
        int[][] card = new int[cardSize][cardSize];
        String[][] markedCard = new String[cardSize][cardSize];
        for (int i = 0; i < card.length; i++)
        {
            for (int j = 0; j < card.length; j++)
            {
                card[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        int announcementAmount = Integer.parseInt(input.nextLine());
        int[] announcement = new int[announcementAmount];
        for (int i = 0; i < announcementAmount; i++)
        {
            announcement[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        System.out.println("Bingo!");
        for (int i = 0; i < card.length; i++)
        {
            for (int j = 0; j < card.length; j++)
            {
                boolean marked = false;
                for (int k = 0; k < announcement.length; k++)
                {
                    if (card[i][j] == announcement[k])
                    {
                        marked = true;
                        break;
                    }
                }
                System.err.print("\n" + "CR " + ((marked) ? "o" : ".") + "\n\n");
                if (!(checkCard(markedCard)) && marked)
                {
                    System.err.println("NM");
                    markedCard[i][j] = "o";
                }
                else
                {
                    System.err.println("MC");
                    markedCard[i][j] = ".";
                }
            }
        }
        System.err.println();
        for (int i = 0; i < markedCard.length; i++)
        {
            for (int j = 0; j < markedCard.length; j++)
            {
                System.out.print(markedCard[i][j] + ((markedCard.length - j != 1) ? " " : "\n"));
            }
        }
    }
}