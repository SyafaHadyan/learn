package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4ARifflex
{
    static final double[][] SHUFFLE_RULE =
    {
        {3,1},
        {0.5,0}
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
            initialShuffle[i] = card[index];
            index++;
        }
        for (int i = 1; i < card.length; i += 2)
        {
            initialShuffle[i] = card[index];
            index++;
        }
        System.out.println(Arrays.toString(initialShuffle));
    }
}