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
            firstSet.add(tempInput[0]);
            secondSet.add(tempInput[1]);
        }
        input.close();
        Collections.sort(firstSet);
        Collections.sort(secondSet);
        for (int i = 0; i < firstSet.size(); i++)
        {
            difference += Math.abs(firstSet.get(i) - secondSet.get(i));
        }
        System.out.println(difference);
    }
}