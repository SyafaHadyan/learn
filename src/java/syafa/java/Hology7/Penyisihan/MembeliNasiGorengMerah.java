package syafa.java.Hology7.Penyisihan;
import java.util.*;
import java.math.*;

@SuppressWarnings("unused")
public class MembeliNasiGorengMerah
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] finalPrice = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int price = Integer.parseInt(input.nextLine());
            int counter = 0;
            while (true)
            {
                if (BigInteger.valueOf(price).isProbablePrime(10))
                {
                    finalPrice[i] = 1;
                    break;
                }
                else
                {
                    counter++;
                    finalPrice[i] = 2;
                    break;
                }
            }
        }
        input.close();
        for (int i = 0; i < finalPrice.length; i++)
        {
            System.out.print(finalPrice[i]);
            if (finalPrice.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}