package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TheBombermanGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] configuration = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        String[][] map = new String[configuration[0]][configuration[1]];
        for (int i = 0; i < configuration[0]; i++)
        {
            map[i] = input.nextLine().split("\s");
        }
        input.close();
        for (int i = 0; i < configuration[2]; i += 2)
        {
            for (int j = 0; j < map.length; j++)
            {
                for (int k = 0; k < map[j].length; k++)
                {
                    //
                }
            }
        }
    }
}