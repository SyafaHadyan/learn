package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;

public class FlippingBits
{
    static class bitManipulate
    {
        public static int flipBit(int bit)
        {
            String binary = Integer.toBinaryString(bit);
            for (int i = 0; i < binary.length(); i++)
            {
                if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 0)
                {
                    //
                    continue;
                }
                if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 1)
                {
                    //
                    continue;
                }
            }
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            result[i] = bitManipulate.flipBit(Integer.parseInt(input.nextLine()));
        }
        input.close();
    }
}