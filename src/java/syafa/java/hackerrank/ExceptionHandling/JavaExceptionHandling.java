package syafa.java.hackerrank.ExceptionHandling;
import java.util.*;

public class JavaExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        double resultArray[] = new double[5];
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
            resultArray[i] = Math.pow(first,second);
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