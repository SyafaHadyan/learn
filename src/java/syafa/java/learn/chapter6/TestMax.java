package syafa.java.learn.chapter6;
import java.util.*;

public class TestMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%-2c","Enter first number",':');
        int firstNumber = Integer.parseInt(input.nextLine());
        System.out.printf("%-20s%-2c","Enter second number",':');
        int secondNumber = Integer.parseInt(input.nextLine());
        input.close();
        System.out.print("The max number is" + ' ' + maxNumber(firstNumber,secondNumber));
    }
    public static int maxNumber (int first, int second)
    {
        int result = 0;
        if (first > second)
        {
            result = first;
        }
        else
        {
            result = second;
        }
        return result;
    }
}