package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandlingTrycatch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        int divide = 0;
        try
        {
            firstNumber = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException e)
        {
            try
            {
                secondNumber = Integer.parseInt(input.nextLine());
            }
            catch (NumberFormatException f)
            {
                System.out.print("java.util.InputMismatchException");
                input.close();
                return;
            }
        }
        try
        {
            secondNumber = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException e)
        {
            // TODO: handle exception
        }
        input.close();
        try
        {
            divide = firstNumber / secondNumber;
        }
        catch (ArithmeticException e)
        {
            System.out.print("java.lang.ArithmeticException: / by zero");
            return;
        }
        System.out.print(divide);
    }
}