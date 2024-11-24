package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3FCatatanPakChanek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        int firstWordOccurence = 0;
        int secondWordOccurence = 0;
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            for (int i = 0; i < tempInput.length; i++)
            {
                if (firstWord.equalsIgnoreCase(tempInput[i]))
                {
                    firstWordOccurence++;
                    if (tempInput.length - i != 1 && secondWord.equalsIgnoreCase(tempInput[i + 1]))
                    {
                        secondWordOccurence++;
                    }
                }
            }
        }
        input.close();
        System.out.println("P" + "(" + secondWord + "|" + firstWord + ")" + " " + "=" + " " + (secondWordOccurence) + "/" + (firstWordOccurence));
    }
}