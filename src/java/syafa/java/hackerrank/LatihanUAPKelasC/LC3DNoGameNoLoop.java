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
        ArrayList<String> gameStatus = new ArrayList<>();
        Map<Integer,String> gameMapStatus = Map.ofEntries
        (
            Map.entry(coinLocation,"Koin didapatkan"),
            Map.entry(finishPosition,"Game finish")
        );
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
            if (playerPosition < 0 || playerPosition > platformSize - 1)
            {
                playerPosition = previousPosition;
            }
            if (gameMapStatus.containsKey(playerPosition) && gameStatus.size() <= 2)
            {
                gameStatus.add(gameMapStatus.get(playerPosition));
            }
            for (int i = 0; i < platformSize; i++)
            {
                System.out.print((i == playerPosition) ? '*' : '.');
            }
            System.out.print("\n");
        }
        input.close();
        for (int i = 0; i < gameStatus.size(); i++)
        {
            System.out.println(gameStatus.get(i));
        }
    }
}