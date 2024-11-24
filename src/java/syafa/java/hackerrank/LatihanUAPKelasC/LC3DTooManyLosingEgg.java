package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DTooManyLosingEgg
{
    static final int MINIMUM_EGG_QUALITY = 6;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int eggAmount = Integer.parseInt(input.nextLine());
        int minimumQuality = 0;
        for (int i = 0; i < eggAmount; i++)
        {
            if (Integer.parseInt(input.nextLine()) >= MINIMUM_EGG_QUALITY)
            {
                minimumQuality++;
            }
        }
        input.close();
    }
}