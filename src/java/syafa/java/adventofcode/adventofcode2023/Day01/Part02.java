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
        int sum = 0;
        while (input.hasNextLine())
        {
            boolean firstStringReduce = true;
            boolean lastStringReduce = true;
            String firstNumberStruct = "";
            String lastNumberStruct = "";
            String tempStringInput = input.nextLine();
            int maxCounter = tempStringInput.length();
            int counterFirst = 0;
            int counterLast = 0;
            while (firstStringReduce && (counterFirst < maxCounter))
            {
                try
                {
                    Integer.parseInt(String.valueOf(tempStringInput.charAt(0)));
                    firstStringReduce = false;
                    counterFirst = maxCounter;
                }
                catch (NumberFormatException e)
                {
                    for (int i = 0; i < NUMBER_WORD.length; i++)
                    {
                        if (tempStringInput.startsWith(NUMBER_WORD[i]))
                        {
                            firstNumberStruct = String.valueOf(i + 1);
                            firstStringReduce = false;
                            counterFirst = maxCounter;
                        }
                    }
                    tempStringInput = tempStringInput.replaceFirst("\\D","");
                }
                counterFirst++;
            }
            while (lastStringReduce && (counterLast < maxCounter))
            {
                try
                {
                    if (tempStringInput.length() != 0)
                    {
                        Integer.parseInt(String.valueOf(tempStringInput.charAt(tempStringInput.length() - 1)));
                    }
                }
                catch (NumberFormatException e)
                {
                    for (int i = 0; i < NUMBER_WORD.length; i++)
                    {
                        if (tempStringInput.endsWith(NUMBER_WORD[i]))
                        {
                            lastNumberStruct = String.valueOf(i + 1);
                            lastStringReduce = false;
                            counterLast = maxCounter;
                        }
                    }
                    tempStringInput = tempStringInput.substring(0,tempStringInput.length() - 1);
                }
                counterLast++;
            }
            if (firstNumberStruct.isEmpty() || lastNumberStruct.isEmpty())
            {
                if (tempStringInput.length() != 0)
                {
                    int[] inputData = Stream.of(tempStringInput.replaceAll("\\D+","").split("")).mapToInt(Integer::parseInt).toArray();
                    if (firstNumberStruct.isEmpty())
                    {
                        firstNumberStruct = String.valueOf(inputData[0]);
                    }
                    if (lastNumberStruct.isEmpty())
                    {
                        lastNumberStruct = String.valueOf(inputData[inputData.length - 1]);
                    }
                }
            }
            sum += Integer.parseInt(String.valueOf(firstNumberStruct.concat(lastNumberStruct)));
        }
        input.close();
        System.out.print(sum);
    }
}