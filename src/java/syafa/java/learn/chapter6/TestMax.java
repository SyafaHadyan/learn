package syafa.java.learn.chapter6;
import java.util.*;
import java.util.stream.*;

public class TestMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Enter first and second number",':');
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        System.out.print("The max number is" + ' ' + maxNumber(number[0],number[1]));
    }
    public static int maxNumber(int first,int second)
    {
        if (first > second)
        {
            return first;
        }
        return second;
    }
}