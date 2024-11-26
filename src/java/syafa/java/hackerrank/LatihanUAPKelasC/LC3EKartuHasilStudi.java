package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3EKartuHasilStudi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = Integer.parseInt(input.nextLine());
        double[][] data = new double[amount][2];
        double result = 0d;
        for (int i = 0; i < data.length; i++)
        {
            input.next();
            for (int j = 0; j < data[i].length; j++)
            {
                data[i][j] = input.nextDouble();
            }
            input.nextLine();
        }
        input.close();
    }
}