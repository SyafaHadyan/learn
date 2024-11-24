package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4AApakahRiilPangram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] word = input.nextLine().replaceAll("[\\W+\\d+]","").toUpperCase().split("");
        input.close();
        Arrays.sort(word);
        ArrayList<String> inputWord = new ArrayList<>(Arrays.asList(word));
        ArrayList<String> validAlphabetList = new ArrayList<>(Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")));
        ArrayList<String> missingAlphabet = new ArrayList<>();
        missingAlphabet.addAll(validAlphabetList);
        for (int i = 0; i < validAlphabetList.size(); i++)
        {
            if (inputWord.contains(validAlphabetList.get(i)))
            {
                missingAlphabet.remove(validAlphabetList.get(i));
            }
        }
        if (!(missingAlphabet.isEmpty()))
        {
            System.out.print("Input bukan merupakan pangram karena tidak memiliki huruf ");
            for (int i = 0; i < missingAlphabet.size(); i++)
            {
                System.out.print(missingAlphabet.get(i));
                if (missingAlphabet.size() - i != 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.print(" :(");
            System.exit(0);
        }
        if (word.length > validAlphabetList.size() && missingAlphabet.isEmpty())
        {
            System.out.print("Input hanya pangram biasa saja :)");
            System.exit(0);
        }
        if (missingAlphabet.isEmpty())
        {
            System.out.print("Input merupakan pangram sempurna! :D");
            System.exit(0);
        }
    }
}