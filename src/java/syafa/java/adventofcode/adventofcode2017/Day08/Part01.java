package syafa.java.adventofcode.adventofcode2017.Day08;
import java.util.*;

@SuppressWarnings("unused")
public class Part01
{
    static final Map<String,Integer> INSTRUCTION_LIST = Map.ofEntries
    (
        Map.entry("inc",1),
        Map.entry("dec",-1)
    );
    public static void main(String[] args)
    {
        /*
         * b inc 5 if a > 1
         * a inc 1 if b < 5
         * c dec -10 if a >= 1
         * c inc -20 if c == 10
         */
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
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
                case "<":
                    if (register.get(instructionInput[4]) > Integer.parseInt(instructionInput[6]))
                    {
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
                case ">=":
                    if (register.get(instructionInput[4]) >= Integer.parseInt(instructionInput[6]))
                    {
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
                case "<=":
                    if (register.get(instructionInput[4]) <= Integer.parseInt(instructionInput[6]))
                    {
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
                case "==":
                    if (register.get(instructionInput[4]) == Integer.parseInt(instructionInput[6]))
                    {
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
                case "!=":
                    if (register.get(instructionInput[4]) != Integer.parseInt(instructionInput[6]))
                    {
                        register.merge(instructionInput[0],INSTRUCTION_LIST.get(instructionInput[1]) * Integer.parseInt(instructionInput[2]),Integer::sum);
                    }
                    break;
            }
        }
        input.close();
        System.out.println(register);
    }
}