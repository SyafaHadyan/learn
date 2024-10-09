package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        //https://github.com/SyafaHadyan/learn/tree/main/src/java/syafa/java/hackerrank/LiveCodingTIFABAB2
        Scanner input = new Scanner(System.in);
        ArrayList<String> match = new ArrayList<String>();
        ArrayList<String> matchResult = new ArrayList<String>();
        ArrayList<Integer> matchScore = new ArrayList<Integer>();
        String hasilPertandingan = "";
        for (int i = 0; i < 4; i++)
        {
            match.add(Arrays.toString(input.nextLine().split(" ")));
            if (match.get(0).equalsIgnoreCase(match.get(1)))
            {
                matchResult.add("Seri");
            }
            else if (match.get(0).equalsIgnoreCase("Batu"))
            {
                if (match.get(1).equalsIgnoreCase("Gunting"))
                {
                    matchResult.add("Dengklek menang");
                    matchScore.set(0,matchScore.get(0) + 1);
                }
                else if (match.get(1).equalsIgnoreCase("Kertas"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
            }
            else if (match.get(0).equalsIgnoreCase("Gunting"))
            {
                if (match.get(1).equalsIgnoreCase("Batu"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
                else if (match.get(1).equalsIgnoreCase("Kertas"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
            }
            else if (match.get(0).equalsIgnoreCase("Kertas"))
            {
                if (match.get(1).equalsIgnoreCase("Batu"))
                {
                    matchResult.add("Dengklek menang");
                    matchScore.set(0,matchScore.get(0) + 1);
                }
                else if (match.get(1).equalsIgnoreCase("Gunting"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
            }
        }
        input.close();
        if (matchScore.get(0) == matchScore.get(1))
        {
            hasilPertandingan = "Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.";
        }
        else if (matchScore.get(0) > matchScore.get(1))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Dengklek dengan skor " + match.get(0) + " vs " + match.get(1) + '.';
        }
        else if (matchScore.get(0) < matchScore.get(1))
        {
            hasilPertandingan = "Perlombaan dimenangkan oleh Sengklek dengan skor " + match.get(1) + " vs " + match.get(0) + '.';
        }
        System.out.print(hasilPertandingan);
    }
}