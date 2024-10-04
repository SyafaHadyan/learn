package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.Scanner;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPengecekan = Integer.parseInt(input.nextLine());
        int cekBilangan = 0;
        String hasilArray[] = new String[jumlahPengecekan];
        String cekBilanganArray[] = input.nextLine().split(" ");
        String cekPrima = "Bukan prima";
        input.close();
        for (int i = 0; i < jumlahPengecekan; i++)
        {
            cekBilangan = Integer.parseInt(cekBilanganArray[i]);
            for (int j = 2; j < cekBilangan; j++)
            {
                if (cekBilangan == 1)
                {
                    cekPrima = "Bukan prima";
                    break;
                }
                else if (cekBilangan % j == 0)
                {
                    cekPrima = "Bukan prima";
                    break;
                }
                else if (cekBilangan % j != 0)
                {
                    cekPrima = "Prima";
                }
            }
            hasilArray[i] = cekBilangan + " = " + cekPrima;
        }
        for (int i = 0; i < jumlahPengecekan; i++)
        {
            System.out.print(hasilArray[i]);
            if (i != jumlahPengecekan - 1)
            {
                System.out.print("\n");
            }
        }
    }
}