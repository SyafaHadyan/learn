package syafa.java.adventofcode.adventofcode2017.Day02;
import java.util.*;
import java.util.stream.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int checkSum = 0;
        while (input.hasNextLine())
        {
            int[] rowInput = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < rowInput.length; i++)
            {
                for (int j = 0 + i; j < rowInput.length; j++)
                {
                    if (rowInput[i] % rowInput[j] == 0 && rowInput[i] != rowInput[j])
                    {
                        checkSum += rowInput[i] / rowInput[j];
                        i = rowInput.length - 1;
                        j = rowInput.length - 1;
                        break;
                    }
                    if (rowInput[j] % rowInput[i] == 0 && rowInput[j] != rowInput[i])
                    {
                        checkSum += rowInput[j] / rowInput[i];
                        i = rowInput.length - 1;
                        j = rowInput.length - 1;
                        break;
                    }
                }
            }
        }
        input.close();
        System.out.println(checkSum);
    }
}