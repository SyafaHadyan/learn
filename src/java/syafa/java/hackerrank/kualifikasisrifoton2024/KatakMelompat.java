package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;
import java.util.stream.*;

public class KatakMelompat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] jump = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int jumpCounter = 1;
        for (int i = 0; i < jump.length; i++)
        {
            try
            {
                if 
                (
                    jump[i + 1] - jump[i] == jumpCounter + 1 ||
                    jump[i + 1] - jump[i] == jumpCounter ||
                    jump[i + 1] - jump[i] == jumpCounter - 1
                )
                {
                    jumpCounter = jump[i + 1] - jump[i];
                    continue;
                }
                System.out.print(false);
                return;
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.print(true);
            }
        }
    }
}