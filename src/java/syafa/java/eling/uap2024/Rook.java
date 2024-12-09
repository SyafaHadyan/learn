package syafa.java.eling.uap2024;
import java.util.*;

public class Rook
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int chessBoardWidth = input.nextInt();
        int chessBoardLength = input.nextInt(); input.nextLine();
        int rookAmount = Integer.parseInt(input.nextLine());
        int freeCount = 0;
        HashMap<Integer,Integer> rookPositionHorizontal = new HashMap<>();
        HashMap<Integer,Integer> rookPositionVertical = new HashMap<>();
        for (int i = 0; i < rookAmount; i++)
        {
            rookPositionHorizontal.putIfAbsent(input.nextInt(),i);
            rookPositionVertical.putIfAbsent(input.nextInt(),i);
            input.nextLine();
        }
        input.close();
        for (int i = 0; i < chessBoardLength; i++)
        {
            if (!(rookPositionVertical.containsKey(i)))
            {
                for (int j = 0; j < chessBoardWidth; j++)
                {
                    if (!(rookPositionHorizontal.containsKey(j)))
                    {
                        freeCount++;
                    }
                }
            }
        }
        System.out.println(freeCount);
    }
}