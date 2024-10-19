package syafa.java.hackerrank.Algorithms.Strings;
import java.util.*;

public class MarsExploration
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] message = input.nextLine().toCharArray();
        int corruptMessage = 0;
        input.close();
        for (int i = 0; i < message.length; i++)
        {
            if (!(message[i] == 'S' && message[i + 1] == 'O' && message[i + 2] == 'S'))
            {
                corruptMessage++;
            }
            i += 2;
        }
        System.out.print(corruptMessage);
    }
}