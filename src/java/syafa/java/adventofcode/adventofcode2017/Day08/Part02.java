package syafa.java.adventofcode.adventofcode2017.Day08;
import java.util.*;

@SuppressWarnings("unused")
public class Part02
{
    static final Map<String,Integer> INSTRUCTION_LIST = Map.ofEntries
    (
        Map.entry("inc",1),
        Map.entry("dec",-1)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int largestRegister = 0;
        HashMap<String,Integer> register = new HashMap<>();
        while (input.hasNextLine())
        {
            String[] instructionInput = input.nextLine().split("\s");
            for (int i = 0; i <= 4; i += 4)
            {
                register.putIfAbsent(instructionInput[i],0);
            }
            switch (instructionInput[5])
            {
                case ">":
                    if (register.get(instructionInput[4]) > Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
                case "<":
                    if (register.get(instructionInput[4]) < Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
                case ">=":
                    if (register.get(instructionInput[4]) >= Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
                case "<=":
                    if (register.get(instructionInput[4]) <= Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
                case "==":
                    if (register.get(instructionInput[4]) == Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
                case "!=":
                    if (register.get(instructionInput[4]) != Integer.parseInt(instructionInput[6]))
                    {
                        register.put(instructionInput[0],register.get(instructionInput[0]) + (INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2])));
                    }
                    break;
            }
        }
        input.close();
        System.err.println(register);
        System.err.println(Collections.max(register.values()));
    }
}