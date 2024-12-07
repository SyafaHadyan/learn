package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class HappyLadybugs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gameAmount = Integer.parseInt(input.nextLine());
        boolean[] possible = new boolean[gameAmount];
        for (int i = 0; i < possible.length; i++)
        {
            int cellSize = Integer.parseInt(input.nextLine());
            String[] cell = input.nextLine().split("");
            HashMap<String,Integer> bug = new HashMap<>();
            for (int j = 0; j < cell.length; j++)
            {
                //
            }
        }
        input.close();
    }
}