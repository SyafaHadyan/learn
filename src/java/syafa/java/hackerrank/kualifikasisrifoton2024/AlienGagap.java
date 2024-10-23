package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;

public class AlienGagap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] inputWords = input.nextLine().split(" ");
        ArrayList<String> validWords = new ArrayList<>();
        for (int i = 0; i < inputWords.length; i++)
        {
            for (int j = 0 + i; j < inputWords.length - i; j++)
            {
                if (!(inputWords[i].equalsIgnoreCase(inputWords[j])))
                {
                    validWords.add(inputWords[i]);
                }
            }
        }
        input.close();
        for (int i = 0; i < validWords.size(); i++)
        {
            System.out.print(validWords.get(i));
            if (validWords.size() - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}