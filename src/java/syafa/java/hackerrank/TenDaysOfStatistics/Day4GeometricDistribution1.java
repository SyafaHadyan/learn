package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4GeometricDistribution1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] probabilityOfDefect = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int defectAt = Integer.parseInt(input.nextLine());
        input.close();
    }
}