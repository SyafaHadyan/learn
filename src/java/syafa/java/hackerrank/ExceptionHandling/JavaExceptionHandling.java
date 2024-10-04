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
        ArrayList<String> resultArray = new ArrayList<String>();
        int i = 0;
        while (input.hasNextDouble())
        {
            first = input.nextDouble();
            second = input.nextDouble();
            try
            {
                if (first == 0 && second == 0)
                {
                    resultArray.add("java.lang.Exception: n and p should not be zero.");
                }
                else if (first < 0 || second < 0)
                {
                    resultArray.add("java.lang.Exception: n or p should not be negative.");
                }
                else
                {
                    result = String.format("%.0f",Math.pow(first,second));
                    resultArray.add(result);
                }
            }
            catch (Exception e)
            {
                resultArray.add("Exception");
            }
            i++;
        }
        input.close();
        for (int j = 0; j < resultArray.size(); i++)
        {
            System.out.printf("%s",resultArray.get(i));
            if (j != resultArray.size() - 1)
            {
                System.out.print("\n");
            }
        }
    }
}