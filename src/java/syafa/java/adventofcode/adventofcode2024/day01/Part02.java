package syafa.java.adventofcode.adventofcode2024.day01;
import java.util.*;
import java.util.stream.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int difference = 0;
        ArrayList<Integer> firstSet = new ArrayList<>();
        HashMap<Integer,Integer> secondSet = new HashMap<>();
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstSet.add(tempInput[0]);
            secondSet.merge(tempInput[1],1,Integer::sum);
        }
        input.close();
        System.out.println(difference);
    }
}