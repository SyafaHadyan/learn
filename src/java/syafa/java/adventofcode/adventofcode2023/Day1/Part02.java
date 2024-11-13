package syafa.java.adventofcode.adventofcode2023.Day1;
import java.util.*;
import java.util.stream.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (input.hasNextLine())
        {
            int[] inputData = Stream.of(input.nextLine().replaceAll("\\D+","").split("")).mapToInt(Integer::parseInt).toArray();
            sum += Integer.parseInt(String.valueOf(inputData[0]) + String.valueOf(inputData[inputData.length - 1]));
        }
        input.close();
        System.out.print(sum);
    }
}