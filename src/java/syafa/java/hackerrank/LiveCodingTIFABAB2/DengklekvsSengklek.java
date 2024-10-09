package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> match = new ArrayList<String>();
        ArrayList<String> matchResult = new ArrayList<String>();
        String hasilPertandingan = "";
        for (int i = 0; i < 4; i++)
        {
            match.add(Arrays.toString(input.nextLine().split(" ")));
            if (match.get(0).equalsIgnoreCase(match.get(1)))
            {
                hasil[i] = "Seri";
            }
            else if (match.get(0).equalsIgnoreCase("Batu"))
            {
                if (match.get(1).equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Dengklek menang";
                    match.get(0)++;
                }
                else if (match.get(1).equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Sengklek menang";
                    match.get(1)++;
                }
            }
            else if (match.get(0).equalsIgnoreCase("Gunting"))
            {
                if (match.get(1).equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Sengklek menang";
                    match.get(1)++;
                }
                else if (match.get(1).equalsIgnoreCase("Kertas"))
                {
                    hasil[i] = "Dengklek menang";
                    match.get(0)++;
                }
            }
            else if (match.get(0).equalsIgnoreCase("Kertas"))
            {
                if (match.get(1).equalsIgnoreCase("Batu"))
                {
                    hasil[i] = "Dengklek menang";
                    match.get(0)++;
                }
                else if (match.get(1).equalsIgnoreCase("Gunting"))
                {
                    hasil[i] = "Sengklek menang";
                    match.get(1)++;
                }
            }
        }
        input.close();
        if (match.get(0) == match.get(1))
        {
            hasilPertandingan = "Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.";
        }
        else if (match.get(0) > match.get(1))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Dengklek dengan skor " + match.get(0) + " vs " + match.get(1) + '.';
        }
        else if (match.get(1) > match.get(0))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Sengklek dengan skor " + match.get(1) + " vs " + match.get(0) + '.';
        }
        for (String output : hasil)
        {
            System.out.println(output);
        }
        System.out.print(hasilPertandingan);
    }
}