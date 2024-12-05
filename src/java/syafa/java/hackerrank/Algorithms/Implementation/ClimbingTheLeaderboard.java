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
        input.nextLine();
        for (int i = 0; i < playerScoreAmount; i++)
        {
            //
        }
        input.close();
    }
}