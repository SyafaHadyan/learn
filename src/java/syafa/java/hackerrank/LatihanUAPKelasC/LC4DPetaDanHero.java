package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DPetaDanHero
{
    static final char EMPTY_SYMBOL = '.';
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt(); input.nextLine();
        int heroCount = Integer.parseInt(input.nextLine());
        String[][] heroPosition = new String[heroCount][3];
        for (int i = 0; i < heroPosition.length; i++)
        {
            heroPosition[i] = input.nextLine().split("\s");
        }
        input.close();
        if (row <= 0 || col <= 0)
        {
            System.out.println("Input tidak sesuai");
            return;
        }
        for (int i = 0; i < heroPosition.length; i++)
        {
            if
            (
                Integer.parseInt(heroPosition[i][0]) < 0 || Integer.parseInt(heroPosition[i][1]) < 0 ||
                Integer.parseInt(heroPosition[i][0]) > row - 1 || Integer.parseInt(heroPosition[i][1]) > col - 1
            )
            {
                System.out.println("Input tidak sesuai");
                return;
            }
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                boolean heroExist = false;
                for (int k = 0; k < heroPosition.length; k++)
                {
                    if (Integer.parseInt(heroPosition[k][0]) == i && Integer.parseInt(heroPosition[k][1]) == j)
                    {
                        System.out.print(heroPosition[k][2]);
                        heroExist = true;
                        break;
                    }
                }
                if (!(heroExist))
                {
                    System.out.print(EMPTY_SYMBOL);
                }
            }
            System.out.print("\n");
        }
    }
}