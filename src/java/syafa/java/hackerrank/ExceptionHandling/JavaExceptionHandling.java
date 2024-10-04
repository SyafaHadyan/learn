package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first = 0d;
        double second = 0d;
        double resultArray[] = new double[5];
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
                    resultArray[i] = 010;
                    break;
                }
                else if (first < 0 || second < 0)
                {
                    resultArray[i] = 101;
                    break;
                }
                else
                {
                    resultArray[i] = Math.pow(first,second);
                }
            }
            catch (Exception e)
            {
                resultArray[i] = 111;
            }
        }
        input.close();
        for (int i = 0; i < resultArray.length; i++)
        {
            System.out.printf("%.0f",resultArray[i]);
            if (i != resultArray.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}