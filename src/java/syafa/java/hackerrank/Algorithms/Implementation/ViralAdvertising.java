package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ViralAdvertising
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cumulativeAtDay = Integer.parseInt(input.nextLine());
        int shared = 5;
        int liked = 0;
        int cumulative = 0;
        input.close();
        for (int i = 1; i <= cumulativeAtDay; i++)
        {
            cumulative += liked = shared / 2;
            shared = liked * 3;
        }
    }
}