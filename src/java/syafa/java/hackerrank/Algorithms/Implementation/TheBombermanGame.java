package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TheBombermanGame
{
    static class simulate
    {
        public static String[][] bomb(String[][] map,int configuration)
        {
            for (int i = 0; i < configuration; i += 2)
            {
                for (int j = 0; j < map.length; j++)
                {
                    for (int k = 0; k < map[j].length; k++)
                    {
                        //
                    }
                }
            }
            return map;
        }
        public static void bombNoSimulate(String[][] map)
        {
            System.exit(0);
        }
    }
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
        if (configuration[2] % 2 == 0)
        {
            simulate.bombNoSimulate(map);
        }
        map = simulate.bomb(map,configuration[2]);
    }
}