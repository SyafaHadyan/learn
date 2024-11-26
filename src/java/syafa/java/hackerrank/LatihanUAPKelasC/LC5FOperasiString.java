package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5FOperasiString
{
    static String[] inputString;
    public static void moveSwap(int swapAmount)
    {
        for (int i = 0; i < swapAmount; i++)
        {
            System.err.println(Arrays.toString(inputString));
            String tempSwap = inputString[inputString.length - 1];
            for (int j = inputString.length - 1; j > 0; j--)
            {
                inputString[j] = inputString[j - 1];
            }
            inputString[0] = tempSwap;
            System.err.println(Arrays.toString(inputString));
        }
    }
    public static void reverse(String inputString)
    {
        //
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        inputString = input.nextLine().split("");
        int operationAmount = Integer.parseInt(input.nextLine());
        for (int j = 0; j < operationAmount; j++)
        {
            String[] operation = input.nextLine().split("\s");
            if (operation[0].equalsIgnoreCase("Geser"))
            {
                moveSwap(Integer.parseInt(operation[1]));
            }
            if (operation[0].equalsIgnoreCase("Balik"))
            {
                //
            }
        }
        input.close();
    }
}