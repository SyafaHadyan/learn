package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3EAyamAyam
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int initialChickenAmount = Integer.parseInt(input.nextLine());
        int dayAmount = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 1; i <= dayAmount; i++)
        {
            initialChickenAmount *= 2;
            if (i % 3 == 0)
            {
                initialChickenAmount -= (initialChickenAmount / 4);
            }
        }
    }
}