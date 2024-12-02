package syafa.java.adventofcode.adventofcode2024.day01;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int difference = 0;
        ArrayList<Integer> firstSet = new ArrayList<>();
        ArrayList<Integer> secondSet = new ArrayList<>();
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}