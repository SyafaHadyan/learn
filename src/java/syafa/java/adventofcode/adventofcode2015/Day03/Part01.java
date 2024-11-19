package syafa.java.adventofcode.adventofcode2015.Day03;
import java.util.*;

public class Part01
{
    static final Map<Character,String> DEFAULT_MOVE = Map.ofEntries
    (
        Map.entry('^',"21"),
        Map.entry('v',"01"),
        Map.entry('>',"12"),
        Map.entry('<',"10")
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] move = input.nextLine().toCharArray();
        input.close();
        int houseVisitCount = 1;
        int[] currentPosition = {0,0};
        HashMap<String,Boolean> visitedHouse = new HashMap<>();
        visitedHouse.put("00",true);
        for (int i = 0; i < move.length; i++)
        {
            String currentMove = DEFAULT_MOVE.get(move[i]);
            for (int j = 0; j < 2; j++)
            {
                currentPosition[j] = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(j))) + currentPosition[j];
            }
            currentMove = String.valueOf(currentPosition[0]).concat(String.valueOf(currentPosition[1]));
            if (visitedHouse.get(currentMove) == null)
            {
                visitedHouse.put(String.valueOf(currentMove),true);
                houseVisitCount++;
            }
        }
        System.out.print(houseVisitCount);
    }
}