package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3ESulungBungsu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int childAmount = Integer.parseInt(input.nextLine());
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < childAmount; i++)
        {
            int tempInput = input.nextInt();
            if (tempInput < lowest)
            {
                lowest = tempInput;
            }
            if (tempInput > highest)
            {
                highest = tempInput;
            }
        }
        input.close();
        System.out.println(lowest + " " + highest);
    }
}