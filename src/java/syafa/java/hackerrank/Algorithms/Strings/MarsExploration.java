package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class MarsExploration
{
    public static void main(String[] args)
    {
        /*
         * SOS OOS OSO SOS OSS OSO SOS OSO SOS
         *      x   x       x   x       x
         * 
         * SOS O O SOS O SOS O SS O SOS O SOS O SOS
         *     x x     x     x  x x  x  x     x 
         * 12
         */
        Scanner input = new Scanner(System.in);
        //char[] message = input.nextLine().toCharArray();
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