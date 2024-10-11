package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class DesignerPDFViewer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> letterIndex = new ArrayList<Character>(Arrays.asList(
        'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
        ArrayList<String> letterHeight = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        String word = input.nextLine();
        input.close();
        word = word.toUpperCase();
        int currentMaxHeight = 0;
        for (int i = 0; i < word.length(); i++)
        {
            for (int j = 0; j < letterIndex.size(); j++)
            {
                if ((word.charAt(i) == (letterIndex.get(j))) && (currentMaxHeight < Integer.parseInt(letterHeight.get(j))))
                {
                    currentMaxHeight = Integer.parseInt(letterHeight.get(j));
                }
                if (i == word.length() - 1)
                {
                    System.out.print(currentMaxHeight * word.length());
                    return;
                }
            }
        }
    }
}