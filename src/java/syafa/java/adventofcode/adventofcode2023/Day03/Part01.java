package syafa.java.adventofcode.adventofcode2023.Day03;
import java.util.*;

public class Part01
{
    public static boolean isDigit(String inputString)
    {
        try
        {
            Integer.parseInt(inputString);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] engine = new String[150][150];
        int counter = 0;
        int engineSchematicSum = 0;
        while (input.hasNextLine())
        {
            engine[counter] = input.nextLine().split("");
        }
        input.close();
        for (int i = 0; i < counter; i++)
        {
            int j = 0;
            boolean performSymbolCheck = false;
            int digitLength = 0;
            while (engine[i][j].equalsIgnoreCase(null))
            {
                if (engine[i][j].equalsIgnoreCase(null))
                {
                    j = 0;
                }
                StringBuilder numberStruct = new StringBuilder();
                boolean isEngineSchematic = false;
                while (isDigit(engine[i][j]))
                {
                    performSymbolCheck = true;
                    numberStruct.append(engine[i][j]);
                    digitLength++;
                    j++;
                }
                if (performSymbolCheck)
                {
                    boolean first = true;
                    for (int k = j - digitLength; k < j + digitLength; k++)
                    {
                        if (first)
                        {
                            for (int l = 0; l < 6; l++)
                            {
                                for (int m = i - 1; m < engine.length; m++)
                                {
                                    try
                                    {
                                        if (!(engine[m][j - 1].equalsIgnoreCase(".")))
                                        {
                                            isEngineSchematic = true;
                                        }
                                    }
                                    catch (IndexOutOfBoundsException e)
                                    {
                                        //
                                    }
                                }
                            }
                        }
                    }
                    if (isEngineSchematic)
                    {
                        engineSchematicSum += Integer.parseInt(String.valueOf(numberStruct));
                    }
                    continue;
                }
                j++;
            }
        }
    }
}