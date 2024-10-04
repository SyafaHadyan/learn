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
        int i = 0;
        while (input.hasNextDouble())
        {
            first = input.nextDouble();
            second = input.nextDouble();
            try
            {
                if (first == 0 && second == 0)
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
            i++;
        }
        input.close();
        for (int j = 0; j < resultArray.length; i++)
        {
            System.out.printf("%s",resultArray[i]);
            if (j != resultArray.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}