package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ARifflex
{
    static final double[][] SHUFFLE_RULE =
    {
        {0.5,0},
        {3,1}
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] card = input.nextLine().split("\s");
        input.close();
        String[] initialShuffle = new String[card.length];
        int index = 0;
        for (int i = 0; i < card.length; i += 2)
        {
            System.err.println("Swap " + i + " with " + index);
            initialShuffle[i] = card[index];
            index++;
        }
        for (int i = 1; i < card.length; i += 2)
        {
            System.err.println("Swap " + i + " with " + index);
            initialShuffle[i] = card[index];
            index++;
        }
        System.err.println(Arrays.toString(initialShuffle));
        for (int i = 0; i < initialShuffle.length; i++)
        {
            String tempSwap = initialShuffle[i];
            int indexSwap = (int) ((i * SHUFFLE_RULE[i % 2][0]) + SHUFFLE_RULE[i % 2][1]) % initialShuffle.length;
            initialShuffle[i] = initialShuffle[indexSwap];
            initialShuffle[indexSwap] = tempSwap;
            System.err.println(Arrays.toString(initialShuffle));
        }
    }
}