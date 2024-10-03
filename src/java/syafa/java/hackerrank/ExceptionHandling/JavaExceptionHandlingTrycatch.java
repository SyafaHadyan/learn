package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandlingTrycatch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            int firstNumber = Integer.parseInt(input.nextLine());
            int secondNumber = Integer.parseInt(input.nextLine());
        }
        catch (InputMismatchException e)
        {
            System.out.print("java.util.InputMismatchException");
        }
    }
}