package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        /*
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
         * 
         * 7
         * 100 100 50 40 40 20 10
         * 4
         * 5 25 50 120
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
        int rankedAmount = Integer.parseInt(input.nextLine());
        int[] rankedRaw = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int playerScoreAmount = Integer.parseInt(input.nextLine());
        int[] playerScore = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        ArrayList<Integer> rankedNoDuplicate = new ArrayList<>();
        rankedNoDuplicate.ensureCapacity(rankedRaw.length);
        for (int i = 0; i < rankedRaw.length; i++)
        {
            if (!(rankedNoDuplicate.contains(rankedRaw[i])))
            {
                rankedNoDuplicate.add(rankedRaw[i]);
            }
        }
        for (int i = 0; i < playerScore.length; i++)
        {
            if (rankedNoDuplicate.contains(playerScore[i]))
            {
                System.out.println(rankedNoDuplicate.indexOf(playerScore[i]) + 1);
                continue;
            }
            ArrayList<Integer> rankedNoDuplicateTemp = new ArrayList<>();
            rankedNoDuplicateTemp.ensureCapacity(rankedRaw.length + 1);
            rankedNoDuplicateTemp.addAll(rankedNoDuplicate);
            rankedNoDuplicateTemp.add(playerScore[i]);
            Collections.sort(rankedNoDuplicateTemp);
            System.out.println(rankedNoDuplicateTemp.size() - rankedNoDuplicateTemp.indexOf(playerScore[i]));
        }
    }
}