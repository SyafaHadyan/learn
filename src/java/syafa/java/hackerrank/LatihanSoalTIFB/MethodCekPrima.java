package syafa.java.hackerrank.LatihanSoalTIFB;

import java.util.Scanner;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPengecekan = Integer.parseInt(input.nextLine());
        int cekBilangan = input.nextInt();
        String hasilArray[] = new String[jumlahPengecekan];
        String cekPrima = "Prima";
        input.close();
        for (int i = 0; i <= jumlahPengecekan; i++)
        {
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