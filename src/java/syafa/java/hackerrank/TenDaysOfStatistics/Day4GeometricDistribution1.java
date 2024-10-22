package syafa.java.hackerrank.TenDaysOfStatistics;
import java.util.*;
import java.util.stream.*;

public class Day4GeometricDistribution1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] probabilityOfDefect = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        int defectAt = Integer.parseInt(input.nextLine());
        input.close();
        System.out.print(Math.pow((1-(probabilityOfDefect[0] / probabilityOfDefect[1])),(defectAt - 1)) * (probabilityOfDefect[0] / probabilityOfDefect[1]));
    }
}