package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;

public class AlienGagap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> inputWord = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = 0; i < inputWord.size(); i++)
        {
            for (int j = 0 + i; j <= inputWord.size() - i; j++)
            {
                try
                {
                    if (inputWord.get(i).equalsIgnoreCase(inputWord.get(j + 1)))
                    {
                        inputWord.remove(j + 1);
                        j--;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        }
        for (int i = 0; i < inputWord.size(); i++)
        {
            System.out.print(inputWord.get(i));
            if (inputWord.size() - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}