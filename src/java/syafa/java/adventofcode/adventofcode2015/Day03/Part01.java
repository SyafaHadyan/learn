package syafa.java.adventofcode.adventofcode2015.Day03;
import java.util.*;

public class Part01
{
    static final Map<Character,String> DEFAULT_MOVE = Map.ofEntries
    (
        Map.entry('^',"01"),
        Map.entry('V',"00"),
        Map.entry('>',"11"),
        Map.entry('<',"10")
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] move = input.nextLine().toCharArray();
        input.close();
        int houseVisitCount = 1;
        int[] currentPosition = new int[2];
        HashMap<String,Boolean> visitedHouse = new HashMap<>();
        for (int i = 0; i < move.length; i++)
        {
            //
        }
    }
}