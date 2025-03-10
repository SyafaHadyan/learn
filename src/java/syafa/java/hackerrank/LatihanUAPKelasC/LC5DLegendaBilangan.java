package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5DLegendaBilangan
{
    public static boolean isMultipleOfTen(long number)
    {
        while (number >= 0 && number % 10 == 0)
        {
            number /= 10;
        }
        return number == 1;
    }
    public static boolean checkKaprekar(long number)
    {
        if (number == 1)
        {
            return true;
        }
        long initialNumber = number;
        number *= number;
        String firstNumber = String.valueOf(number);
        String secondNumber = String.valueOf(number);
        if (String.valueOf(number).length() == 1 || isMultipleOfTen(initialNumber))
        {
            System.err.println("DGCT False");
            System.err.println(initialNumber + "\n" + number + "\n");
            return false;
        }
        for (int i = 1; i < String.valueOf(number).length(); i++)
        {
            String tempFirstNumber = firstNumber.substring(0,i);
            String tempSecondNumber = secondNumber.substring(tempFirstNumber.length(),secondNumber.length());
            if (Long.parseLong(tempFirstNumber) + Long.parseLong(tempSecondNumber) == initialNumber)
            {
                return true;
            }
        }
        return false;
        // if (String.valueOf(number).length() % 2 == 0)
        // {
        //     firstNumber = firstNumber.substring(0,(firstNumber.length() / 2));
        //     secondNumber = secondNumber.substring((secondNumber.length() / 2),secondNumber.length());
        //     System.err.println("FN " + firstNumber);
        //     System.err.println("SN " + secondNumber);
        //     System.err.println("FNSNRS " + (Long.parseLong(firstNumber) + Long.parseLong(secondNumber)) + "\n");
        //     return (Long.parseLong(firstNumber) + Long.parseLong(secondNumber)) == initialNumber;
        // }
        // firstNumber = firstNumber.substring(0,(firstNumber.length() / 2));
        // secondNumber = secondNumber.substring(firstNumber.length(),secondNumber.length());
        // System.err.println("FN " + firstNumber);
        // System.err.println("SN " + secondNumber);
        // System.err.println("FNSNRS " + (Long.parseLong(firstNumber) + Long.parseLong(secondNumber)) + "\n");
        // return (Long.parseLong(firstNumber) + Long.parseLong(secondNumber)) == initialNumber;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        boolean[] kaprekarValidity = new boolean[numberAmount];
        long[] numberList = new long[numberAmount];
        boolean validInput = true;
        for (int i = 0; i < kaprekarValidity.length; i++)
        {
            long tempInput = Long.parseLong(input.nextLine());
            numberList[i] = tempInput;
            if (tempInput <= 0)
            {
                validInput = false;
            }
            kaprekarValidity[i] = checkKaprekar(tempInput);
        }
        input.close();
        if (validInput && numberAmount > 0)
        {
            for (int i = 0; i < kaprekarValidity.length; i++)
            {
                System.out.println(numberList[i] + " " + ((kaprekarValidity[i]) ? "adalah" : "bukan") + " " + "bilangan Kaprekar");
            }
            return;
        }
        System.out.println("Program Error");
    }
}