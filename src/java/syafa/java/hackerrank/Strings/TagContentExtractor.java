package syafa.java.hackerrank.Strings;
import java.util.*;

public class TagContentExtractor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = Integer.parseInt(input.nextLine());
        String content = "";
        ArrayList<String> extractedContent = new ArrayList<String>();
        for (int i = 0; i < amount; i++)
        {
            content = input.nextLine();
            extractedContent.add(content.split("<h1>"));
        }
    }
}