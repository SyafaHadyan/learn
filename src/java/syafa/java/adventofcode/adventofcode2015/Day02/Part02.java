package syafa.java.adventofcode.adventofcode2015.Day02;
import java.util.*;
import java.util.stream.*;

public class Part02
{
    static final int MAX_BOX_INPUT = 1000;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ribbonSize = 0;
        for (int i = 0; i < MAX_BOX_INPUT; i++)
        {
            int[] boxDimension = Stream.of(input.nextLine().split("x")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(boxDimension);
            ribbonSize += ((boxDimension[0] * 2) + (boxDimension[1] * 2)) + (boxDimension[0] * boxDimension[1] * boxDimension[2]);
        }
        input.close();
        System.out.print(ribbonSize);
    }
}