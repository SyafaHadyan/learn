package syafa.java.Hology7.Penyisihan;
import java.util.*;
import java.util.stream.*;

@SuppressWarnings("unused")
public class Pelit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int pass0 = input.nextInt();
            int pass1 = input.nextInt();
            result[i] = 0;
            for (int j = 1; j <= pass1; j++)
            {
                result[i] += (int) Math.pow(pass0,j);
            }
        }
        input.close();
        for (int i = 0; i < testCase; i++)
        {
            System.out.println(result[i]);
            if (testCase - i != 0)
            {
                //System.out.print("\n");
            }
        }
    }
}