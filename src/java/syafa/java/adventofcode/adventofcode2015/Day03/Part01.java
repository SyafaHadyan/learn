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
        //int[] currentPosition = new int[2];
        int[] currentPosition = {0,0};
        HashMap<String,Boolean> visitedHouse = new HashMap<>();
        visitedHouse.put("00",true);
        for (int i = 0; i < move.length; i++)
        {
            String currentMove = DEFAULT_MOVE.get(move[i]);
            int move0 = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(0))) + currentPosition[0];
            int move1 = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(1))) + currentPosition[1];
            currentPosition[0] = move0;
            currentPosition[1] = move1;
            if (visitedHouse.get(String.valueOf(currentPosition)) == null)
            {
                visitedHouse.put(String.valueOf(currentPosition),true);
                houseVisitCount++;
            }
        }
        System.out.print(houseVisitCount);
    }
}