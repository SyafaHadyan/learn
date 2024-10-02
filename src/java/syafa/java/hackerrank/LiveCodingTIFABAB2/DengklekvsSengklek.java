package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        String hasil[] = new String[4];
        Scanner input = new Scanner(System.in);
        String hasilPertandingan = "";
        int skorDengklek = 0;
        int skorSengklek = 0;
        for (int i = 0; i < 4; i++)
        {
            String sengklek = input.next();
            String dengklek = input.next();
            if (dengklek.equalsIgnoreCase(sengklek))
            {
                hasil[i] = "Seri";
            }
            else if (dengklek.equalsIgnoreCase("Batu"))
            {
                if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Dengklek menang";
                    skorDengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Sengklek menang";
                    skorSengklek++;
                }
            }
            else if (dengklek.equalsIgnoreCase("Gunting"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Sengklek menang";
                    skorSengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Dengklek menang";
                    skorDengklek++;
                }
            }
            else if (dengklek.equalsIgnoreCase("Kertas"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Dengklek menang";
                    skorDengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Sengklek menang";
                    skorSengklek++;
                }
            }
        }
        input.close();
        if (skorDengklek == skorSengklek)
        {
            hasilPertandingan = "Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.";
        }
        else if (skorDengklek > skorSengklek)
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Dengklek dengan skor " + skorDengklek + " vs " + skorSengklek + '.';
        }
        else if (skorSengklek > skorDengklek)
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Sengklek dengan skor " + skorSengklek + " vs " + skorDengklek + '.';
        }
        for (String output : hasil)
        {
            System.out.println(output);
        }
        System.out.print(hasilPertandingan);
    }
}