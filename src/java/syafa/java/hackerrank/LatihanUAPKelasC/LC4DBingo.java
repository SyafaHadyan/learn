package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DBingo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cardSize = Integer.parseInt(input.nextLine());
        int[][] card = new int[cardSize][cardSize];
        for (int i = 0; i < card.length; i++)
        {
            for (int j = 0; j < card.length; j++)
            {
                card[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        int announcementAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < card.length; i++)
        {
            int tempInput = Integer.parseInt(input.nextLine());
            for (int j = 0; j < card.length; j++)
            {
                for (int k = 0; k < card.length; k++)
                {
                    if (card[j][k] == tempInput)
                    {
                        System.out.print("O" + ((card.length - k != 1) ? " " : "\n"));
                    }
                }
            }
        }
        input.close();
    }
}