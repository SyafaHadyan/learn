package syafa.java.hackerrank.BigNumber;
import java.util.*;
import java.math.*;

public class JavaBigDecimal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        BigDecimal[] array = new BigDecimal[arraySize];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = input.nextBigDecimal();
            input.nextLine();
        }
        input.close();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0 + i; j < array.length; j++)
            {
                //
            }
        }
    }
}