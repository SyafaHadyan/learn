package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class HappyLadybugs
{
    static final String EMPTY_CELL = "_";
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gameAmount = Integer.parseInt(input.nextLine());
        boolean[] possible = new boolean[gameAmount];
        for (int i = 0; i < possible.length; i++)
        {
            int cellSize = Integer.parseInt(input.nextLine());
            boolean isPossible = true;
            boolean containsEmptyCell = false;
            String[] cell = input.nextLine().split("");
            HashMap<String,Integer> bug = new HashMap<>();
            for (int j = 0; j < cellSize; j++)
            {
                if (!(cell[j].equalsIgnoreCase(EMPTY_CELL)))
                {
                    bug.merge(cell[j],1,Integer::sum);
                    continue;
                }
                else
                {
                    containsEmptyCell = true;
                }
            }
            for (String j : bug.keySet())
            {
                int tempGet = bug.get(j);
                if (tempGet == 1)
                {
                    isPossible = false;
                    break;
                }
            }
            if (!(containsEmptyCell) && cell.length != 1)
            {
                boolean currentPossible = true;
                for (int j = 0; j < cell.length - 1; j++)
                {
                    if (cell[j].equalsIgnoreCase(cell[j + 1]))
                    {
                        continue;
                    }
                    else
                    {
                        j++;
                        try
                        {
                            if (!(cell[j].equalsIgnoreCase(cell[j + 1])))
                            {
                                currentPossible = false;
                                break;
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e)
                        {
                            currentPossible = false;
                        }
                    }
                }
                if (currentPossible)
                {
                    isPossible = true;
                    containsEmptyCell = true;
                }
            }
            if ((isPossible && containsEmptyCell))
            {
                possible[i] = true;
            }
        }
        input.close();
        for (int i = 0; i < possible.length; i++)
        {
            if (possible[i])
            {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}