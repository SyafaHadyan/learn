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
        int startPosition = Integer.parseInt(input.nextLine());
        int finishPosition = Integer.parseInt(input.nextLine());
        int coinLocation = Integer.parseInt(input.nextLine());
        String[] gameStatus = new String[2];
        System.out.println("Game dimulai!");
        while (input.hasNextLine())
        {
            startPosition += MOVE_INSTRUCTION.get(input.nextLine());
            if (startPosition == coinLocation)
            {
                gameStatus[1] = "Koin didapatkan!";
            }
            if (startPosition == finishPosition)
            {
                gameStatus[0] = "Game finish!";
            }
            for (int i = 0; i < platformSize; i++)
            {
                System.out.print((i == startPosition) ? '*' : '.');
            }
            System.out.print("\n");
        }
        input.close();
    }
}