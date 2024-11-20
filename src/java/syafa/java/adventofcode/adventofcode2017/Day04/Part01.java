package syafa.java.adventofcode.adventofcode2017.Day04;
import java.util.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int validPassphrase = 0;
        while (input.hasNextLine())
        {
            ArrayList<String> passphraseInput = new ArrayList<>();
            Set<String> passphraseNoDuplicate = new HashSet<>();
            while (input.hasNext())
            {
                String tempInput = input.next();
                passphraseInput.add(tempInput);
                passphraseNoDuplicate.add(tempInput);
            }
            if (passphraseInput.size() == passphraseNoDuplicate.size())
            {
                validPassphrase++;
            }
        }
        input.close();
        System.out.println(validPassphrase);
    }
}