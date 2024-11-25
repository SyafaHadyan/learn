package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5DLegendaBilangan
{
    public static boolean checkKaprekar(int number)
    {
        number *= number;
        int firstNumber = Integer.parseInt(String.valueOf(number).substring(0,(String.valueOf(number).length()) / 2));
        int secondNumbere = Integer.parseInt(String.valueOf(number).substring((String.valueOf(number).length() / 2 + ((String.valueOf(number).length() % 2 != 0) ? - 1 : 0)),String.valueOf(number).length()));
        
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        boolean[] kaprekarValidity = new boolean[numberAmount];
        for (int i = 0; i < kaprekarValidity.length; i++)
        {
            //
        }
        input.close();
    }
}