package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class MarsExploration
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        input.close();
        int corruptMessage = 0;
        String sos = "SOS";
        for (int i = 0; i < message.length(); i++)
        {
            if (!(message.charAt(i) == sos.charAt(i % sos.length())))
            {
                corruptMessage++;
            }
        }
        System.out.print(corruptMessage);
    }
}