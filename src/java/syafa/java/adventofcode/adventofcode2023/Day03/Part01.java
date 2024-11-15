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
        String tempInput = "";
        int counter = 0;
        int engineSchematicSum = 0;
        while (input.hasNextLine())
        {
            tempInput = input.nextLine();
            engine[counter] = tempInput.split("");
            counter++;
        }
        input.close();
        for (int i = 0; i <= counter; i++)
        {
            for (int j = 0; j < tempInput.length(); j++)
            {
                int digitLength = 0;
                StringBuilder numberStruct = new StringBuilder();
                boolean isEngineSchematic = false;
                boolean performSymbolCheck = false;
                while (isDigit(engine[i][j]))
                {
                    performSymbolCheck = true;
                    numberStruct.append(engine[i][j]);
                    digitLength++;
                    j++;
                }
                if (performSymbolCheck)
                {
                    for (int k = i - 1; k <= i + 1; k++)
                    {
                        try
                        {
                            if (!(engine[k][j - digitLength - 1].equalsIgnoreCase(".")) && k != -1 && k != counter)
                            {
                                isEngineSchematic = true;
                            }
                        }
                        catch (IndexOutOfBoundsException e)
                        {
                            //
                        }
                        catch (NullPointerException e)
                        {
                            //
                        }
                    }
                    for (int k = j - digitLength - 1; k < j; k++)
                    {
                        for (int l = i - 1; l <= i + 1; l += 2)
                        {
                            try
                            {
                                if (!(engine[l][k].equalsIgnoreCase(".")))
                                {
                                    isEngineSchematic = true;
                                }
                            }
                            catch (IndexOutOfBoundsException e)
                            {
                                //
                            }
                            catch (NullPointerException e)
                            {
                                //
                            }
                        }
                    }
                    for (int k = i - 1; k <= i + 1; k++)
                    {
                        try
                        {
                            if (!(engine[k][j].equalsIgnoreCase(".")) && k != -1 && k != counter && j != tempInput.length())
                            {
                                isEngineSchematic = true;
                            }
                        }
                        catch (IndexOutOfBoundsException e)
                        {
                            //
                        }
                        catch (NullPointerException e)
                        {
                            //
                        }
                    }
                    if (isEngineSchematic)
                    {
                        engineSchematicSum += Integer.parseInt(String.valueOf(numberStruct));
                        j--;
                    }
                }
            }
        }
        System.out.print(engineSchematicSum);
    }
}