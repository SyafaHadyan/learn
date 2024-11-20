package syafa.java.adventofcode.adventofcode2017.Day02;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int checkSum = 0;
        while (input.hasNextLine())
        {
            int[] rowInput = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(rowInput);
            checkSum += (rowInput[rowInput.length - 1] - rowInput[0]);
        }
        input.close();
        System.out.println(checkSum);
    }
}