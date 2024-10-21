package syafa.java.codeinclass.methodjava;
import java.util.*;
import java.util.stream.*;

public class MethodCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Enter first and second number",':');
        double[] number = Stream.of(input.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        input.close();
        System.out.printf("%-30s%-2c%.1f\n","The max number is",':',maxNumber(number[0],number[1]));
        System.out.printf("%-30s%-2c%.1f\n","The sum is",':',addTwoNumber(number[0],number[1]));
        System.out.printf("%-30s%-2c%.1f\n","The substraction is",':',substractTwoNumber(number[0],number[1]));
        System.out.printf("%-30s%-2c%.1f\n","The multiplication is",':',multiplyTwoNumber(number[0],number[1]));
        System.out.printf("%-30s%-2c%.1f","The divided value is",':',divideTwoNumber(number[0],number[1]));
    }
    public static double maxNumber(double first,double second)
    {
        if (first > second)
        {
            return first;
        }
        return second;
    }
    public static double addTwoNumber(double first,double second)
    {
        return (first + second);
    }
    public static double substractTwoNumber(double first,double second)
    {
        return (first - second);
    }
    public static double multiplyTwoNumber(double first,double second)
    {
        return (first * second);
    }
    public static double divideTwoNumber(double first,double second)
    {
        return (first / second);
    }
}