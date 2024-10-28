package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class TheBombermanGame
{
    static class simulate
    {
        public static String[][] bomb(String[][] map,int configuration)
        {
            for (int i = 0; i < configuration; i += 3)
            {
                for (int j = 0; j < map.length; j++)
                {
                    for (int k = 0; k < map[j].length; k++)
                    {
                        if (map[j][k].equalsIgnoreCase("O"))
                        {
                            map[j][k] = ".";
                            continue;
                        }
                        if (map[j][k].equalsIgnoreCase("."));
                        {
                            map[j][k] = "O";
                            continue;
                        }
                    }
                }
            }
            return map;
        }
        public static String[][] bombNoSimulate(String[][] map)
        {
            for (int i = 0; i < map.length; i++)
            {
                for (int j = 0; j < map[i].length; j++)
                {
                    map[i][j] = "O";
                }
            }
            return map;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] configuration = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        String[][] map = new String[configuration[0]][configuration[1]];
        for (int i = 0; i < configuration[0]; i++)
        {
            map[i] = input.nextLine().split("(?!^)");
        }
        input.close();
        if (configuration[2] % 2 == 0)
        {
            simulate.bombNoSimulate(map);
        }
        map = simulate.bomb(map,configuration[2]);
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j]);
            }
            if (map.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}