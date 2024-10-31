package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ACMICPCTeam
{
    static class teamICPC
    {
        public static int[] teamConfig(int[][] team)
        {
            int[] result = new int[2];
            return result;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] config = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[][] team = new int[config[0]][config[1]];
        int[] result = new int[2];
        for (int i = 0; i < config[0]; i++)
        {
            team[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        result = teamICPC.teamConfig(team);
        System.out.print(result[0] + "\n" + result[1]);
    }
}