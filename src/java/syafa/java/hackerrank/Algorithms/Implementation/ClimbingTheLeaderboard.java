package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        /*
         * 7
         * 100 100 50 40 40 20 10
         * 4
         * 5 25 50 120
         * 
         * input rank
         * 100 100 50 40 40 20 10 (should be array + 1)
         * 
         * use set which can only contain distinct values > return index at > store at currentPlayerPosition[i]
         * 
         * keep index when
         * sort player
         * 5 25 50 120
         * 
         * first iterate
         * 
         *     1   1   2  3  3  4  5  6
         * 5 > 100 100 50 40 40 20 10 5
         * currentPlayerPosition[0] = 6
         * 
         * second iterate
         * 
         *      1   1   2  3  3  4  5  6
         * 25 > 100 100 50 40 40 25 20 10
         * currentPlayerPosition[1] = 4
         * 
         * 6
         * 4
         * 2
         * 1
         * 
         * 6
         * 100 90 90 80 75 60
         * 5
         * 50 65 77 90 102
         * 
         * 6
         * 5
         * 4
         * 2
         * 1
         */
        Scanner input = new Scanner(System.in);
        int[] ranked = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] player = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] currentPlayerPosition = new int[player.length];
        for (int i = 0; i < player.length; i++)
        {
            Set<Integer> temp = new HashSet<>();
            for (int j = 0; j < ranked.length; j++)
            {
                temp.add(ranked[j]);
                if (ranked.length - j == 1)
                {
                    temp.add(player[i]);
                    int[] newTemp = new int[temp.size()];
                    System.arraycopy(temp.toArray(),0,newTemp,0,temp.size());
                    Arrays.sort(newTemp);
                    System.out.println();
                    for (int k = 0; k < newTemp.length; k++)
                    {
                        System.out.println(newTemp[k]);
                    }
                }
            }
        }
        input.close();
    }
}