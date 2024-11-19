package syafa.java.adventofcode.adventofcode2015.Day01;
import java.util.*;

public class Part01
{
    static final Map<Character,Integer> STAIRCASE_SYMBOL = Map.ofEntries
    (
        Map.entry('(',1),
        Map.entry(')',-1)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] inputFloor = input.nextLine().toCharArray();
        input.close();
        int floor = 0;
        for (int i = 0; i < inputFloor.length; i++)
        {
            floor += STAIRCASE_SYMBOL.get(inputFloor[i]);
        }
        System.out.print(floor);
    }
}