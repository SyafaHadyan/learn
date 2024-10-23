package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;
import java.util.stream.*;

public class SeparateTheNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String numberStr = input.nextLine();
        String[] numberStrArr = input.nextLine().split("");
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < numberStr.length(); i++)
        {
            try
            {
                if (Integer.parseInt(String.valueOf(numberStr.charAt(i + 1))) - Integer.parseInt(String.valueOf(numberStr.charAt(i))) == 1)
                {
                    //
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
        input.close();
        System.out.println();
    }
}