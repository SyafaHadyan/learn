package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DPetaDanHero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt(); input.nextLine();
        int heroCount = Integer.parseInt(input.nextLine());
        String[][] heroPosition = new String[Math.abs(row)][Math.abs(col)];
        for (int i = 0; i < Math.abs(row); i++)
        {
            heroPosition[i] = input.nextLine().split("\s");
        }
        if (row <= 0 || col <= 0)
        {
            System.out.println("Input tidak sesuai");
            return;
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                for (int k = 0; k < heroPosition.length; k++)
                {
                    if (Integer.parseInt(heroPosition[k][0]) == i && Integer.parseInt(heroPosition[k][1]) == j)
                    {
                        System.out.print(heroPosition[k][2] + ((col - j != 1) ? " " : ""));
                    }
                }
            }
            System.out.print("\n");
        }
    }
}