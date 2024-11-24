package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3FSegitigaAngka
{
    static final int NUMBER_LIMIT = 9;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int staircaseSize = Integer.parseInt(input.nextLine());
        input.close();
        int counter = 0;
        for (int i = 0; i < staircaseSize; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(counter + ((i - j != 0) ? " " : ""));
                counter++;
                if (counter > NUMBER_LIMIT)
                {
                    counter = 0;
                }
            }
            System.out.print("\n");
        }
    }
}