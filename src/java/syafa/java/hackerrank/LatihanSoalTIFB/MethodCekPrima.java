package syafa.java.hackerrank.LatihanSoalTIFB;

import java.util.Scanner;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPengecekan = Integer.parseInt(input.nextLine());
        int cekBilangan = Integer.parseInt(input.nextLine());
        String cekPrima = "Prima";
        for (int i = 0; i < args.length; i++)
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
        }
        System.out.print(cekPrima);
    }
}