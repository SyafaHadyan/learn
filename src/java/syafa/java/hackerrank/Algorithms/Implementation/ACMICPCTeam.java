package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ACMICPCTeam
{
    static class teamICPC
    {
        public static int[] teamConfig(int[][] team)
        {
            int maxTopicKnown = 0;
            int teamTopicKnown = 0;
            for (int i = 0; i < team.length; i++)
            {
                for (int j = 1 + i; j < team.length; j++)
                {
                    int tempMaxTopicKnown = 0;
                    for (int k = 0; k < team[i].length; k++)
                    {
                        if ((team[i][k] == 1) || (team[j][k] == 1))
                        {
                            tempMaxTopicKnown++;
                        }
                    }
                    if (tempMaxTopicKnown > maxTopicKnown)
                    {
                        maxTopicKnown = tempMaxTopicKnown;
                        teamTopicKnown = 0;
                    }
                    if (maxTopicKnown == tempMaxTopicKnown)
                    {
                        teamTopicKnown++;
                    }
                }
            }
            return new int[]{maxTopicKnown,teamTopicKnown};
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
            team[i] = Stream.of(input.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        result = teamICPC.teamConfig(team);
        System.out.print(result[0] + "\n" + result[1]);
    }
}