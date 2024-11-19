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
        String currentPosition = "00";
        HashMap<String,Boolean> visitedHouse = new HashMap<>();
        visitedHouse.put(currentPosition,true);
        for (int i = 0; i < move.length; i++)
        {
            String currentMove = DEFAULT_MOVE.get(move[i]);
            int move0 = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(0))) + Integer.parseInt(String.valueOf(currentPosition.charAt(0)));
            int move1 = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(1))) + Integer.parseInt(String.valueOf(currentPosition.charAt(1)));
            //String tempMove = String.valueOf(-1 + Integer.parseInt(String.valueOf(currentMove.charAt(0)) + Integer.parseInt(String.valueOf(currentPosition.charAt(0))))).concat(String.valueOf(-1 + Integer.parseInt(String.valueOf(currentMove.charAt(1)) + Integer.parseInt(String.valueOf(currentPosition.charAt(1))))));
            String tempMove = String.valueOf(move0).concat(String.valueOf(move1));
            currentPosition = tempMove;
            if (visitedHouse.get(tempMove) == null)
            {
                visitedHouse.put(tempMove,true);
                houseVisitCount++;
            }
            //currentPosition[0] = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(0)));
            //currentPosition[1] = -1 + Integer.parseInt(String.valueOf(currentMove.charAt(1)));
        }
        System.out.print(houseVisitCount);
    }
}