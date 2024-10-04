package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first = 0d;
        double second = 0d;
        String resultArray[] = new String[5];
        for (int i = 0; i < resultArray.length; i++)
        {
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
            try
            {
                if (first == 0 || second == 0)
                {
                    resultArray[i] = "zero";
                    break;
                }
                else if (first < 0 || second < 0)
                {
                    resultArray[i] = "below zero";
                    break;
                }
                else
                {
                    resultArray[i] = String.format("%.0f",Double.toString(Math.pow(first,second)));
                }
            }
            catch (Exception e)
            {

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