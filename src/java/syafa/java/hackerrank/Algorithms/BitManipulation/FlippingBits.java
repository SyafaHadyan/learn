package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;

public class FlippingBits
{
    static class bitManipulate
    {
        public static int convertToBinary (int number)
        {
            return Integer.parseInt(String.format("%32s",Integer.toBinaryString(number).replaceAll("\s","0")));
        }
        public static int flipBit(int bit)
        {
            bit = bitManipulate.convertToBinary(bit);
            String binary = Integer.toBinaryString(bit);
            StringBuilder flippedBits = new StringBuilder();
            for (int i = 0; i < binary.length(); i++)
            {
                if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 0)
                {
                    flippedBits.append(1);
                    continue;
                }
                if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 1)
                {
                    flippedBits.append(0);
                    continue;
                }
            }
            return Integer.parseInt(String.valueOf(flippedBits),2);
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