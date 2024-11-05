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
         */
        Scanner input = new Scanner(System.in);
        int rankedAmount = Integer.parseInt(input.nextLine());
        int[] rankedRaw = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int playerScoreAmount = Integer.parseInt(input.nextLine());
        int[] playerScore = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Set<Integer> rankedProcessed = new HashSet<>();
        HashMap<Integer,Integer> rankedHashMap = new HashMap<>();
        ArrayList<Integer> rankedNoDuplicate = new ArrayList<>();
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
                System.out.print("I ");
                System.out.println(i);
                continue;
            }
            ArrayList<Integer> rankedNoDuplicateTemp = new ArrayList<>();
            rankedNoDuplicateTemp.addAll(rankedNoDuplicate);
            rankedNoDuplicateTemp.add(playerScore[i]);
            Collections.sort(rankedNoDuplicateTemp);
            Collections.reverse(rankedNoDuplicateTemp);
            for (int j = 0; j < rankedNoDuplicateTemp.size(); j++)
            {
                if (rankedNoDuplicateTemp.get(j) == (playerScore[i]))
                {
                    System.out.print("J ");
                    System.out.println(j + 1);
                    break;
                }
            }
        }
        /*
        for (int i = 0; i < rankedRaw.length; i++)
        {
            if (rankedHashMap.get(rankedRaw[i]) == null)
            {
                rankedHashMap.put(rankedRaw[i],i);
            }
        }
        */
        /*
        for (int i = 0; i < playerScore.length; i++)
        {
            if (rankedHashMap.get(playerScore[i]) == null)
            {
                for (int j = 0; j < playerScore.length; j++)
                {
                    if (rankedHashMap.containsKey(playerScore[j]) > playerScore[j] && )
                    {
                        //
                    }
                }
            }
            System.out.println(rankedHashMap.get(playerScore[i]));
        }
        */
        /*
        ArrayList<Integer> rankedProcessed = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        rankedProcessed.add(rankedRaw[0]);
        int counter = 0;
        for (int i = 0; i < rankedRaw.length - 1; i++)
        {
            if (rankedProcessed.get(counter) != rankedRaw[i + 1])
            {
                rankedProcessed.add(rankedRaw[i + 1]);
                counter++;
            }
        }
        for (int i = 0; i < playerScore.length; i++)
        {
            temp = new ArrayList<>(rankedProcessed);
            temp.add(playerScore[i]);
            Collections.sort(temp);
            for (int j = 0; j < temp.size() - 1; j++)
            {
                if (playerScore[i] == temp.get(j))
                {
                    if (temp.get(j) != temp.get(j + 1))
                    {
                        System.out.println(temp.size() - j);
                        temp.clear();
                        break;
                    }
                    System.out.println(temp.size() - j - 1);
                    temp.clear();
                    break;
                }
                if (temp.size() - j == 2)
                {
                    System.out.println(1);
                    temp.clear();
                }
            }
        }
        */
    }
}