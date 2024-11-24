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
    }
}