package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cekBilangan = Integer.parseInt(input.nextLine());
        input.close();
        String cekPrima = "Prima";
        for (int i = 2; i < cekBilangan; i++)
        {
            if (cekBilangan % i == 0)
            {
                cekPrima = "Bukan prima";
                break;
            }
        }
        System.out.print(cekPrima);
    }
}