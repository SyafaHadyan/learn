package syafa.java.hackerrank.LiveCodingTIFABAB2;
import java.util.*;

public class DengklekvsSengklek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> matchResult = new ArrayList<String>();
        ArrayList<Integer> matchScore = new ArrayList<Integer>();
        String dengklek = "";
        String sengklek = "";
        for (int i = 0; i < 2; i++)
        {
            matchScore.add(0);
        }
        for (int i = 0; i < 4; i++)
        {
            String[] match = input.nextLine().split(" ");
            dengklek = match[1];
            sengklek = match[0];
            if (dengklek.equalsIgnoreCase(sengklek))
            {
                matchResult.add("Seri");
            }
            if (dengklek.equalsIgnoreCase("Batu"))
            {
                if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    matchResult.add("Dengklek menang");
                    matchScore.set(0,matchScore.get(0) + 1);
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
            }
            else if (dengklek.equalsIgnoreCase("Gunting"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
                else if (sengklek.equalsIgnoreCase("Kertas"))
                {
                    matchResult.add("Dengklek menang");
                    matchScore.set(0,matchScore.get(0) + 1);
                }
            }
            else if (dengklek.equalsIgnoreCase("Kertas"))
            {
                if (sengklek.equalsIgnoreCase("Batu"))
                {
                    matchResult.add("Dengklek menang");
                    matchScore.set(0,matchScore.get(0) + 1);
                }
                else if (sengklek.equalsIgnoreCase("Gunting"))
                {
                    matchResult.add("Sengklek menang");
                    matchScore.set(1,matchScore.get(1) + 1);
                }
            }
        }
        input.close();
        for (int i = 0; i < matchResult.size(); i++)
        {
            System.out.println(matchResult.get(i));
            if (i == matchResult.size() - 1)
            {
                if (matchScore.get(0) == matchScore.get(1))
                {
                    System.out.println("Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia.");
                }
                else if (matchScore.get(0) > matchScore.get(1))
                {
                    System.out.println("Perlombaan dimenangkan oleh Dengklek dengan skor " + matchScore.get(0) + " vs " + matchScore.get(1) + '.');
                }
                else if (matchScore.get(0) < matchScore.get(1))
                {
                    System.out.println("Perlombaan dimenangkan oleh Sengklek dengan skor " + matchScore.get(1) + " vs " + matchScore.get(0) + '.');
                }
            }
        }
    }
}