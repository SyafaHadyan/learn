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
            secondNumber = Integer.parseInt(input.nextLine());
            input.close();
        }
        catch (InputMismatchException e)
        {
            System.out.print("java.util.InputMismatchException");
        }
        try
        {
            divide = firstNumber / secondNumber;
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
}