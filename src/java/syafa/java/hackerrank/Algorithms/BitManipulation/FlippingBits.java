package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;

public class FlippingBits
{
    static class bitManipulate
    {
        public static String convertToBinary (int number)
        {
            return String.format("%32s",(String.format("%32s",Integer.toBinaryString(number).replaceAll("\s","0"))).replaceAll("\s","0"));
        }
        public static int flipBit(int bit)
        {
            String bitString = bitManipulate.convertToBinary(bit);
            StringBuilder flippedBits = new StringBuilder();
            for (int i = 0; i < bitString.length(); i++)
            {
                if (Integer.parseInt(String.valueOf(bitString.charAt(i))) == 0)
                {
                    flippedBits.append(1);
                    continue;
                }
                if (Integer.parseInt(String.valueOf(bitString.charAt(i))) == 1)
                {
                    flippedBits.append(0);
                    continue;
                }
            }
            return Integer.parseInt(String.valueOf(flippedBits));
        }
    }
    public static void main(String[] args)
    {
        /*
         *  1111111111111111111111111111111
         * 1000000000000000000000000000000010000000000000000000000000000000
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++)
        {
            result[i] = bitManipulate.flipBit(Integer.parseInt(input.nextLine()));
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}