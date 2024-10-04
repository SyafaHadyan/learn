package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first = 0d;
        double second = 0d;
        String result = "";
        String resultArray[] = new String[5];
        for (int i = 0; i < resultArray.length; i++)
        {
            first = input.nextDouble();
            second = input.nextDouble();
            /*
            try
            {
                first = input.nextDouble();
                second = input.nextDouble();
            }
            catch (Exception e)
            {
                try
                {
                    second = input.nextDouble();
                }
                catch (Exception f)
                {
                    //Nothing to handle for now
                }
            }
            */
            try
            {
                if (first == 0 || second == 0)
                {
                    resultArray[i] = "java.lang.Exception: n and p should not be zero.";
                }
                else if (first < 0 || second < 0)
                {
                    resultArray[i] = "java.lang.Exception: n or p should not be negative.";
                }
                else
                {
                    result = String.format("%.0f",Math.pow(first,second));
                    resultArray[i] = result;
                }
            }
            catch (Exception e)
            {
                resultArray[i] = "Exception";
            }
        }
        input.close();
        for (int i = 0; i < resultArray.length; i++)
        {
            System.out.printf("%s",resultArray[i]);
            if (i != resultArray.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}