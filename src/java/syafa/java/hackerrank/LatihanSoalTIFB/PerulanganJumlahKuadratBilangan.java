package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganJumlahKuadratBilangan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int hasil = 0;
        int jumlah = 0;
        if (a > b)
        {
            for (int i = a; i >= b; i--)
            {
                jumlah = i * i;
                hasil += jumlah;
            }
        }
        else if (a < b)
        {
            for (int i = a; i <= b; i++)
            {
                jumlah = i * i;
                hasil += jumlah;
            }
        }
        System.out.print(hasil);
    }
}