package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class MarsExploration
{
    public static void main(String[] args)
    {
        /*
         * SOS OOS OSO SOS OSS OSO SOS OSO SOS
         *      x   x   x   x   x       x
         * 12
         */
        Scanner input = new Scanner(System.in);
        char[] message = input.nextLine().toCharArray();
        int corruptMessage = 0;
        input.close();
        for (int i = 0; i < message.length; i++)
        {
            if ((message[i] == 'S'))
            {
                if (message[i + 1] == 'O')
                {
                    if (message[i + 2] == 'S')
                    {
                        //
                    }
                }
            }
            i += 2;
        }
        System.out.print(corruptMessage);
    }
}