package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;
import java.util.stream.*;

public class LC4DMenambangDanKerajinan
{
    static int[] coordinateLimit;
    static final ArrayList<String> VALID_BLOCK_LIST = new ArrayList<>(Arrays.asList
    (
        "air",
        "dirt",
        "grass",
        "wood",
        "stone"
    ));
    public static void printUtil(HashMap<List<Integer>,String> registeredBlock)
    {
        for (int i = 0; i < coordinateLimit[0]; i++)
        {
            for (int j = 0; j < coordinateLimit[1]; j++)
            {
                for (int k = 0; k < coordinateLimit[2]; k++)
                {
                    String tempGetKeyVal = registeredBlock.get(Collections.unmodifiableList(Arrays.asList(i,j,k)));
                    if (tempGetKeyVal != null && VALID_BLOCK_LIST.contains(tempGetKeyVal) && !(tempGetKeyVal.equalsIgnoreCase("Air")))
                    {
                        System.out.printf("%s%-2c%d %d %d %-3s%s\n","Block",':',i,j,k,"is",tempGetKeyVal);
                    }
                    else if (tempGetKeyVal != null && !(tempGetKeyVal.equalsIgnoreCase("Air")))
                    {
                        System.out.printf("%s%-2c%d %d %d %-3s%s\n","Block",':',i,j,k,"is","unknown");
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        coordinateLimit = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        HashMap<List<Integer>,String> registeredBlock = new HashMap<>();
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            if (!(tempInput[0].equalsIgnoreCase("Stop")))
            {
                registeredBlock.put
                (
                    Collections.unmodifiableList
                    (
                        Arrays.asList(Integer.parseInt(tempInput[1]),Integer.parseInt(tempInput[2]),Integer.parseInt(tempInput[3]))
                    ),
                    tempInput[0]
                );
                continue;
            }
            printUtil(registeredBlock);
            break;
        }
        input.close();
    }
}