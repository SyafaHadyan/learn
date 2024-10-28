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
            int numberCount = 0;
            for (double i : numbers)
            {
                average += i;
                numberCount++;
            }
            return average / numberCount;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] number = Stream.of(input.nextLine().split("\s")).mapToDouble(Double::parseDouble).toArray();
        System.out.print(numberOperation.average(number));
        input.close();
    }
}