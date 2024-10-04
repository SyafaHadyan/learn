package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
        {
            int first = input.nextInt();
            int second = input.nextInt();
            input.nextLine();
        }
        input.close();
    }
}