package syafa.java.hackerrank.LatihanSoalTIFB;

import java.util.Scanner;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPengecekan = Integer.parseInt(input.nextLine());
        String hasilArray[] = new String[jumlahPengecekan];
        int cekBilangan = 0;
        String cekPrima = "Prima";
        for (int i = 0; i <= jumlahPengecekan; i++)
        {
            cekBilangan = input.nextInt();
            for (int j = 2; j < cekBilangan; j++)
            {
                if (cekBilangan % j == 0)
                {
                    cekPrima = "Bukan prima";
                    break;
                }
            }
            if (cekBilangan == 1)
            {
                cekPrima = "Bukan prima";
            }
            hasilArray[i] = cekBilangan + " = " + cekPrima;

        }
    }
}