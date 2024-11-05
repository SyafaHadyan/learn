package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.HashMap;
import java.util.Scanner;

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
        int rankedAmount = input.nextInt();
        input.nextLine();
        HashMap<Integer,Integer> rankHashMap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < rankedAmount; i++)
        {
            int temp = input.nextInt();
            if (!(rankHashMap.containsValue(temp)))
            {
                rankHashMap.put(counter + 1,temp);
                counter++;
            }
        }
        input.nextLine();
        int playerScoreAmount = input.nextInt();
        input.nextLine();
        int rankHashMapSize = rankHashMap.size();
        for (int i = 0; i < playerScoreAmount; i++)
        {
            int temp = input.nextInt();
            for (int j = 1; j <= rankHashMapSize; j++)
            {
                if (rankHashMap.get(j) < temp || rankHashMap.get(j) == temp)
                {
                    System.out.println(j);
                    break;
                }
                if (rankHashMapSize - j == 0)
                {
                    System.out.println(rankHashMapSize + 1);
                    break;
                }
            }
        }
        input.close();
    }
}