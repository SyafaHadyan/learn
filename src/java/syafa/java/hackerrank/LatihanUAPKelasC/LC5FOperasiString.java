package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5FOperasiString
{
    public static void moveSwap(String[] inputString)
    {
        //
    }
    public static void reverse(String inputString)
    {
        //
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputString = input.nextLine().split("");
        int operationAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < operationAmount; i++)
        {
            String[] operation = input.nextLine().split("\s");
            if (operation[0].equalsIgnoreCase("Geser"))
            {
                //
            }
            if (operation[0].equalsIgnoreCase("Balik"))
            {
                //
            }
        }
        input.close();
    }
}