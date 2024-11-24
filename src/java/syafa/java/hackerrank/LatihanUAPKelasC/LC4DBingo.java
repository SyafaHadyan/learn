package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DBingo
{
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
                System.err.print((((marked) ? "o" : ".") + ((card.length - j != 1) ? " " : "\n")));
                markedCard[i][j] = ((marked) ? "o" : ".");
            }
        }
        System.err.println();
        for (int i = 0; i < markedCard.length; i++)
        {
            for (int j = 0; j < markedCard.length; j++)
            {
                System.err.print(markedCard[i][j] + ((markedCard.length - j != 1) ? " " : "\n"));
            }
        }
    }
}