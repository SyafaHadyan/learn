package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rankedAmount = Integer.parseInt(input.nextLine());
        HashMap<Integer,Integer> ranked = new HashMap<>();
        for (int i = 1; i <= rankedAmount;)
        {
            int tempInput = input.nextInt();
            if (!(ranked.containsKey(tempInput)))
            {
                ranked.put(tempInput,i);
                i++;
            }
        }
        input.nextLine();
        int playerScoreAmount = Integer.parseInt(input.nextLine());
        int[] playerScore = new int[playerScoreAmount];
        for (int i = 0; i < playerScoreAmount; i++)
        {
            playerScore[i] = input.nextInt();
        }
        input.close();
        System.err.println(ranked);
    }
}