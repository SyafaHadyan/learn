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
                //resultArray[i] = String.format("%.0f",Double.toString(Math.pow(first,second)));
                if (first == 0 || second == 0)
                {
                    resultArray[i] = 00000;
                    break;
                }
                else if (first < 0 || second < 0)
                {
                    resultArray[i] = 00000;
                    break;
                }
                else
                {
                    resultArray[i] = Math.pow(first,second);
                }
            }
            catch (Exception e)
            {

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