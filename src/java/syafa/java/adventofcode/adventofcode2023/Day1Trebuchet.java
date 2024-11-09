package syafa.java.adventofcode.adventofcode2023;
import java.util.*;
import java.util.stream.*;

public class Day1Trebuchet
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (input.hasNextLine())
        {
            int[] inputData = Stream.of(input.nextLine().replaceAll("\\D+","").split("")).mapToInt(Integer::parseInt).toArray();
            sum += (inputData[0] + inputData[inputData.length - 1]);
        }
        input.close();
        System.out.print(sum);
    }
}