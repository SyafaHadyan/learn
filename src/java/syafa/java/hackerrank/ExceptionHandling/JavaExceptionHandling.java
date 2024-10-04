package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        for (int i = 1; i <= 5; i++)
        {
            try
            {
                
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
            first = input.nextInt();
            second = input.nextInt();
            input.nextLine();
        }
        input.close();
    }
}