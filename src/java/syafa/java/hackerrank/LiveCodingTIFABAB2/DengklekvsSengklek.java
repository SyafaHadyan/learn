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
        //int matchResult.get(0) = 0;
        //int matchResult.get(1) = 0;
        for (int i = 0; i < 4; i++)
        {
            matchResult.add(Arrays.toString(input.nextLine().split(" ")));
            if (matchResult.get(0).equalsIgnoreCase(matchResult.get(1)))
            {
                hasil[i] = "Seri";
            }
            else if (matchResult.get(0).equalsIgnoreCase("Batu"))
            {
                if (matchResult.get(1).equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Dengklek menang";
                    matchResult.get(0)++;
                }
                else if (matchResult.get(1).equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Sengklek menang";
                    matchResult.get(1)++;
                }
            }
            else if (matchResult.get(0).equalsIgnoreCase("Gunting"))
            {
                if (matchResult.get(1).equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Sengklek menang";
                    matchResult.get(1)++;
                }
                else if (matchResult.get(1).equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Dengklek menang";
                    matchResult.get(0)++;
                }
            }
            else if (matchResult.get(0).equalsIgnoreCase("Kertas"))
            {
                if (matchResult.get(1).equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Dengklek menang";
                    matchResult.get(0)++;
                }
                else if (matchResult.get(1).equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Sengklek menang";
                    matchResult.get(1)++;
                }
            }
        }
        input.close();
        if (matchResult.get(0) == matchResult.get(1))
        {
            hasilPertandingan = "Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.";
        }
        else if (matchResult.get(0) > matchResult.get(1))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Dengklek dengan skor " + matchResult.get(0) + " vs " + matchResult.get(1) + '.';
        }
        else if (matchResult.get(1) > matchResult.get(0))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Sengklek dengan skor " + matchResult.get(1) + " vs " + matchResult.get(0) + '.';
        }
        for (String output : hasil)
        {
            System.out.println(output);
        }
        System.out.print(hasilPertandingan);
    }
}