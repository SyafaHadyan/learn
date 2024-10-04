package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        double result = 0d;
        String resultArray[] = new String[5];
        for (int i = 0; i < resultArray.length; i++)
        {
            try
            {
                first = input.nextInt();
                second = input.nextInt();
            }
            catch (Exception e)
            {
                try
                {
                    second = input.nextInt();
                }
                catch (Exception f)
                {
                    //Nothing to handle for now
                }
            }
            if (first <= 0 && second <= 0)
            {
                resultArray[i] = "java.lang.Exception: n and p should not be zero.";
            }
            result = Math.pow(first,second);
            resultArray[i] = String.parseString(result);
        }
        input.close();
        for (int i = 0; i < resultArray.length; i++)
        {
            System.out.print(resultArray[i]);
            if (i != resultArray.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}