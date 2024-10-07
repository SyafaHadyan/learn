package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DTandaiPeta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        int arrayHeight = Integer.parseInt(input.nextLine());
        int arrayWidth = Integer.parseInt(input.nextLine());
        int amountOfMarks = Integer.parseInt(input.nextLine());
        String[][] map = new String[arrayHeight][arrayWidth];
        for (int i = 0; i < amountOfMarks; i++)
        {
            String[] markAt = input.nextLine().split(" ");
            map[Integer.parseInt(markAt[0])][Integer.parseInt(markAt[1])] = "x";
        }
        input.close();
        for (int i = 0; i < arrayHeight; i++)
        {
            for (int j = 0; j < arrayWidth; j++)
            {
                System.out.print(map[i][j]);
            }
            if (i < arrayHeight)
            {
                System.out.print("\n");
            }
        }
    }
}