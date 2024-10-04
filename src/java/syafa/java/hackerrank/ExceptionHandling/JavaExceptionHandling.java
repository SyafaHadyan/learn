package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        double result = 0;
        String resultArray[] = new String[6];
        for (int i = 0; i <= resultArray.length; i++)
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
            try
            {
                resultArray[i] = String.format("%.0f", Double.toString(Math.pow(first,second)));
            }
            catch (IllegalFormatConversionException e)
            {
                if (first == 0 && second == 0)
                {
                    resultArray[i] = "java.lang.Exception: n and p should not be zero.";
                    break;
                }
                else if (first < 0 || second < 0)
                {
                    resultArray[i] = "java.lang.Exception: n or p should not be negative.";
                    break;
                }
            }
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