package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rankedAmount = Integer.parseInt(input.nextLine());
        ArrayList<Integer> ranked = new ArrayList<>();
        for (int i = 0; i < rankedAmount; i++)
        {
            int tempInput = input.nextInt();
            if (!(ranked.contains(tempInput)))
            {
                ranked.add(tempInput);
            }
        }
        input.nextLine();
        System.err.println(ranked);
        int playerScoreAmount = Integer.parseInt(input.nextLine());
        int[] playerRankResult = new int[playerScoreAmount];
        for (int i = 0; i < playerScoreAmount; i++)
        {
            int tempInput = input.nextInt();
            boolean added = false;
            for (int j = 0; j < ranked.size(); j++)
            {
                if (tempInput > ranked.get(j))
                {
                    playerRankResult[i] = j + 1;
                    added = true;
                    System.err.println(Arrays.toString(playerRankResult));
                    break;
                }
                if (tempInput == ranked.get(j))
                {
                    playerRankResult[i] = j + 1;
                    added = true;
                    System.err.println(Arrays.toString(playerRankResult));
                    break;
                }
            }
            if (!(added))
            {
                playerRankResult[i] = ranked.size() + 1;
                System.err.println(Arrays.toString(playerRankResult));
            }
        }
        input.close();
        System.err.println(Arrays.toString(playerRankResult));
        for (int i : playerRankResult)
        {
            System.out.println(i);
        }
    }
}