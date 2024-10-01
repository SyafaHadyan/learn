package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganJumlahKuadratBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        input.close();
        double hasil = 0d;
        double jumlah = 0d;
        if (a > b)
        {
            for (double i = a; i >= b; i--)
            {
                jumlah = i * i;
                hasil += jumlah;
            }
        }
        else if (a < b)
        {
            for (double i = a; i <= b; i++)
            {
                jumlah = i * i;
                hasil += jumlah;
            }
        }
        else if (a == b)
        {
            hasil = a * b;
        }
        System.out.printf("%.0f",hasil);
    }
}