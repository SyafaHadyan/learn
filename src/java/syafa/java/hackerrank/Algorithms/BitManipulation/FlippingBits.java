package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;

public class FlippingBits
{
    static class bitManipulate
    {
        public static int flipBit(int bit)
        {
            int binary = Integer.parseInt(Integer.toBinaryString(bit));
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