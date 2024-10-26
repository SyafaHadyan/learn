package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day10BinaryNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String binaryString = Integer.toBinaryString(Integer.parseInt(input.nextLine()));
        // 10101010100110 - example
        int[] binary = Integer.toString(Integer.parseInt(input.nextLine())).chars().map(Character::getNumericValue).toArray();
        input.close();
    }
}