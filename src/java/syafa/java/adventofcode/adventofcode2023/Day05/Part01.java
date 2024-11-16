package syafa.java.adventofcode.adventofcode2023.Day05;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer,Integer> seedToDestination = new HashMap<>();
    public static void advanceScanner()
    {
        input.nextLine();
        input.nextLine();
    }
    public static void main(String[] args)
    {
        input.next();
        int[] seedToPlant = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        advanceScanner();
        input.close();
    }
}