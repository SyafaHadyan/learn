package syafa.java.adventofcode.adventofcode2017.Day06;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] memoryBlock = Stream.of(input.nextLine().split("\s++")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}