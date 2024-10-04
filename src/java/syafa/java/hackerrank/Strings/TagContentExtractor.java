package syafa.java.hackerrank.Strings;
import java.util.*;

public class TagContentExtractor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = Integer.parseInt(input.nextLine());
        String content = "";
        //String extractedContent[];
        ArrayList<String> extractedContentArray = new ArrayList<String>();
        for (int i = 0; i < amount; i++)
        {
            content = input.nextLine();
            String extractedContent[] = content.split("<(.+)>([^<]+)</\\1>");
            extractedContentArray.add(extractedContent[i]);
        }
        for (int i = 0; i < extractedContentArray.size(); i++)
        {
            System.out.print(extractedContentArray.get(i));
            if (i < extractedContentArray.size())
            {
                System.out.print("\n");
            }
        }
    }
}