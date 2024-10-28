package syafa.java.codeinclass.methodjava;
import java.util.*;
import java.util.stream.*;

public class ArgumenTakTentu
{
    static class numberOperation
    {
        public static double average(double... numbers)
        {
            double average = 0d;
            return average;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] number = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}