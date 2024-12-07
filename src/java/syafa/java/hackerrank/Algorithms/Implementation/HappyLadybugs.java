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
            String[] cell = input.nextLine().split("");
            HashMap<String,Integer> bug = new HashMap<>();
            for (int j = 0; j < cellSize; j++)
            {
                if (!(cell[i].equalsIgnoreCase(EMPTY_CELL)))
                {
                    bug.merge(cell[i],1,Integer::sum);
                }
            }
            for (String j : bug.keySet())
            {
                if (bug.get(j) % 2 != 0)
                {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible)
            {
                possible[i] = true;
            }
        }
        input.close();
    }
}