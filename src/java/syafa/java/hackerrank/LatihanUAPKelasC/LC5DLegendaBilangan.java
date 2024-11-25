package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5DLegendaBilangan
{
    public static boolean checkKaprekar(int number)
    {
        number *= number;
        int firstNumber = Integer.parseInt(String.valueOf(number).substring(0,(String.valueOf(number).length()) / 2));
        int secondNumber = Integer.parseInt(String.valueOf(number).substring((String.valueOf(number).length() / 2 + ((String.valueOf(number).length() % 2 != 0) ? - 1 : 0)),String.valueOf(number).length()));
        return (firstNumber + secondNumber) == number;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        boolean[] kaprekarValidity = new boolean[numberAmount];
        int[] numberList = new int[numberAmount];
        boolean validInput = true;
        for (int i = 0; i < kaprekarValidity.length; i++)
        {
            int tempInput = Integer.parseInt(input.nextLine());
            numberList[i] = tempInput;
            if (tempInput < 1)
            {
                validInput = false;
            }
            kaprekarValidity[i] = checkKaprekar(tempInput);
        }
        input.close();
        if (validInput)
        {
            for (int i = 0; i < kaprekarValidity.length; i++)
            {
                System.out.println(numberList[i] + " " + ((kaprekarValidity[i]) ? "adalah" : "bukan") + " " + "bilangan kaprekar");
            }
            return;
        }
        System.out.println("Program Error");
    }
}