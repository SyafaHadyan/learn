package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DTandaiPeta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arraySize = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        int amountOfMarks = Integer.parseInt(input.nextLine());
        String[][] map = new String[Integer.parseInt(arraySize.get(0))][Integer.parseInt(arraySize.get(1))];
        for (int i = 0; i < Integer.parseInt(arraySize.get(0)); i++)
        {
            for (int j = 0; j < Integer.parseInt(arraySize.get(1)); j++)
            {
                map[i][j] = ".";
            }
        }
        for (int i = 0; i < amountOfMarks; i++)
        {
            String[] markAt = input.nextLine().split(" ");
            map[Integer.parseInt(markAt[0])][Integer.parseInt(markAt[1])] = "x";
        }
        input.close();
        for (int i = 0; i < Integer.parseInt(arraySize.get(0)); i++)
        {
            for (int j = 0; j < Integer.parseInt(arraySize.get(1)); j++)
            {
                System.out.print(map[i][j]);
                if (j < Integer.parseInt(arraySize.get(1)))
                {
                    System.out.print(' ');
                }
            }
            if (i < Integer.parseInt(arraySize.get(0)))
            {
                System.out.print("\n");
            }
        }
    }
}