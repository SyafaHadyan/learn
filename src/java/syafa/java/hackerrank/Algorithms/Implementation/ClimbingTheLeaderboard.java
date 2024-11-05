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
        //int[] rankedRaw = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        //int playerScoreAmount = Integer.parseInt(input.nextLine());
        //int[] playerScore = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        //ArrayList<Integer> rankedNoDuplicate = new ArrayList<>();
        HashMap<Integer,Integer> rankHashMap = new HashMap<>();
        //rankedNoDuplicate.ensureCapacity(rankedRaw.length);
        int counter = 0;
        for (int i = 0; i < rankedAmount; i++)
        {
            /*
            if (!(rankedNoDuplicate.contains(rankedRaw[i])))
            {
                rankedNoDuplicate.add(rankedRaw[i]);
            }
            */
            int temp = input.nextInt();
            if (!(rankHashMap.containsValue(temp)))
            {
                rankHashMap.put(counter + 1,temp);
                counter++;
            }
        }
        input.nextLine();
        int playerScoreAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < playerScoreAmount; i++)
        {
            /*
            if (rankedNoDuplicate.contains(playerScore[i]))
            {
                System.out.println(rankedNoDuplicate.indexOf(playerScore[i]) + 1);
                continue;
            }
            */
            /*
            if (rankHashMap.containsValue(playerScore[i]))
            {
                System.out.println(rankHashMap.get(i));
                continue;
            }
            */
            //ArrayList<Integer> rankedNoDuplicateTemp = new ArrayList<>();
            //HashMap<Integer,Integer> rankHashMapTemp = new HashMap<>();
            //rankedNoDuplicateTemp.ensureCapacity(rankedRaw.length + 1);
            //rankedNoDuplicateTemp.addAll(rankedNoDuplicate);
            //rankedNoDuplicateTemp.add(playerScore[i]);
            //Collections.sort(rankedNoDuplicateTemp);
            //System.out.println(rankedNoDuplicateTemp.size() - rankedNoDuplicateTemp.indexOf(playerScore[i]));
            //rankHashMapTemp.putAll(rankHashMap);
            int temp = input.nextInt();
            for (int j = 1; j <= rankHashMap.size(); j++)
            {
                if (rankHashMap.get(j) < temp || rankHashMap.get(j) == temp)
                {
                    System.out.println(j);
                    break;
                }
                if (rankHashMap.size() - j == 0)
                {
                    System.out.println(rankHashMap.size() + 1);
                    break;
                }
            }
        }
    }
}