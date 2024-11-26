package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3EKartuHasilStudi
{
    static final double[][] SKS_THRESHOLD =
    {
        {3,24},
        {2.5,21},
        {2.18},
        {1.5,15},
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = Integer.parseInt(input.nextLine());
        double[][] data = new double[amount][2];
        double result = 0d;
        int SKS = 0;
        int nextSKS = 12;
        for (int i = 0; i < data.length; i++)
        {
            input.next();
            for (int j = 0; j < data[i].length; j++)
            {
                data[i][j] = input.nextDouble();
            }
            input.nextLine();
            SKS += data[i][1];
        }
        input.close();
        for (int i = 0; i < data.length; i++)
        {
            result += data[i][0] * data[i][1] / SKS;
        }
        for (int i = 0; i < SKS_THRESHOLD.length; i++)
        {
            if (result >= SKS_THRESHOLD[i][0])
            {
                nextSKS = (int) SKS_THRESHOLD[i][1];
                break;
            }
        }
        System.out.printf("%s%-2c%.2f\n%s%-2c%-9s%d %s\n","IP Semester",':',(result),"Beban Studi",':',"maksimum",(nextSKS),"sks");
    }
}