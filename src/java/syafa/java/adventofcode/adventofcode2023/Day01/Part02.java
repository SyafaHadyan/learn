package syafa.java.adventofcode.adventofcode2023.Day01;
import java.util.*;
import java.util.stream.*;

public class Part02
{
    /*
    static final Map<String,Integer> NUMBER_WORD = Map.of
    (
        "one",1,
        "two",2,
        "three",3,
        "four",4,
        "five",5,
        "six",6,
        "seven",7,
        "eight",8,
        "nine",9
    );
    */
    static final String[] NUMBER_WORD =
    {
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstNumberStruct = "";
        String lastNumberStruct = "";
        int sum = 0;
        while (input.hasNextLine())
        {
            String tempStringInput = input.nextLine();
            for (int i = 0; i < NUMBER_WORD.length; i++)
            {
                if (tempStringInput.startsWith(NUMBER_WORD[i]))
                {
                    firstNumberStruct = String.valueOf(i + 1);
                    break;
                }
            }
            for (int i = 0; i < NUMBER_WORD.length; i++)
            {
                if (tempStringInput.endsWith(NUMBER_WORD[i]))
                {
                    lastNumberStruct = String.valueOf(i + 1);
                    break;
                }
            }
            if (firstNumberStruct.isEmpty() || lastNumberStruct.isEmpty())
            {
                int[] inputData = Stream.of(tempStringInput.replaceAll("\\D+","").split("")).mapToInt(Integer::parseInt).toArray();
                if (firstNumberStruct.isEmpty())
                {
                    firstNumberStruct = String.valueOf(inputData[0]);
                }
            }
            /*
            if (NUMBER_WORD.containsKey(temp))
            {
                sum += NUMBER_WORD.get(temp);
            }
            int[] inputData = Stream.of(input.nextLine().replaceAll("\\D+","").split("")).mapToInt(Integer::parseInt).toArray();
            sum += Integer.parseInt(String.valueOf(inputData[0]) + String.valueOf(inputData[inputData.length - 1]));
            */
        }
        input.close();
        System.out.print(sum);
    }
}