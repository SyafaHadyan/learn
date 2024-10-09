package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> matchResult = new ArrayList<String>();
        String hasil[] = new String[4];
        String hasilPertandingan = "";
        int dengklek = 0;
        int sengklek = 0;
        for (int i = 0; i < 4; i++)
        {
            matchResult.add(Arrays.toString(input.nextLine().split(" ")));
            if (dengklek.equalsIgnoreCase(sengklek))
            {
                hasil[i] = "Seri";
            }
            else if (dengklek.equalsIgnoreCase("Batu"))
            {
                if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Dengklek menang";
                    dengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Sengklek menang";
                    sengklek++;
                }
            }
            else if (dengklek.equalsIgnoreCase("Gunting"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Sengklek menang";
                    sengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Dengklek menang";
                    dengklek++;
                }
            }
            else if (dengklek.equalsIgnoreCase("Kertas"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Dengklek menang";
                    dengklek++;
                }
                else if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Sengklek menang";
                    sengklek++;
                }
            }
        }
        input.close();
        if (dengklek == sengklek)
        {
            hasilPertandingan = "Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.";
        }
        else if (dengklek > sengklek)
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Dengklek dengan skor " + dengklek + " vs " + sengklek + '.';
        }
        else if (sengklek > dengklek)
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Sengklek dengan skor " + sengklek + " vs " + dengklek + '.';
        }
        for (String output : hasil)
        {
            System.out.println(output);
        }
        System.out.print(hasilPertandingan);
    }
}