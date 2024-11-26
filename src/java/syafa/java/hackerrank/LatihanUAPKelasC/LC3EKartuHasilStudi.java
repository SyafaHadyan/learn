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
        int SKS = 0;
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
        System.out.printf("%s%-2c%.2f\n%s%-2c%-9s%d %s\n","IP Semester",':',(result),"Beban Studi",':',"maksimum",(0),"sks");
    }
}