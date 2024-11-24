package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DNoGameNoLoop
{
    static final Map<String,Integer> MOVE_INSTRUCTION = Map.ofEntries
    (
        Map.entry("left",-1),
        Map.entry("right",1)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int platformSize = Integer.parseInt(input.nextLine());
        int playerPosition = Integer.parseInt(input.nextLine());
        int finishPosition = Integer.parseInt(input.nextLine());
        int coinLocation = Integer.parseInt(input.nextLine());
        boolean coinStatus = false;
        System.out.println("Game dimulai!");
        for (int i = 0; i < platformSize; i++)
        {
            System.out.print((i == playerPosition) ? '*' : '.');
        }
        System.out.println();
        while (input.hasNextLine())
        {
            String tempInput = input.nextLine();
            int previousPosition = playerPosition;
            playerPosition += MOVE_INSTRUCTION.get(tempInput);
            if (playerPosition < 0 || playerPosition > platformSize - 1 || playerPosition == finishPosition)
            {
                if (playerPosition == finishPosition)
                {
                    previousPosition = playerPosition;
                }
                playerPosition = previousPosition;
            }
            if (playerPosition == coinLocation)
            {
                coinStatus = true;
            }
            for (int i = 0; i < platformSize; i++)
            {
                System.out.print((i == playerPosition) ? '*' : '.');
            }
            System.out.print("\n");
        }
        input.close();
        System.out.println("Game finish!" + ((coinStatus) ? "\n" + "Koin didapatkan!" : ""));
    }
}