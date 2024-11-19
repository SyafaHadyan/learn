package syafa.java.adventofcode.adventofcode2015.Day02;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wrappingPaperSize = 0;
        while (input.hasNextLine())
        {
            int[] boxDimension = Stream.of(input.nextLine().split("x")).mapToInt(Integer::parseInt).toArray();
            wrappingPaperSize += ((2 * boxDimension[0] * boxDimension[1]) + (2 * boxDimension[1] * boxDimension[2]) + (2 * boxDimension[2] * boxDimension[0]));
        }
        input.close();
    }
}