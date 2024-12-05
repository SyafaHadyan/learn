package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rankedAmount = Integer.parseInt(input.nextLine());
        HashMap<Integer,Integer> ranked = new HashMap<>();
        int counter = 1;
        for (int i = 0; i < rankedAmount; i++)
        {
            int tempInput = input.nextInt();
            if (!(ranked.containsKey(tempInput)))
            {
                ranked.put(tempInput,counter++);
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