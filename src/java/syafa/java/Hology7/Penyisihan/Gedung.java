package syafa.java.Hology7.Penyisihan;
import java.util.*;
import java.util.stream.*;

@SuppressWarnings("unused")
public class Gedung
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int buildingNode = Integer.parseInt(input.nextLine());
        int bottomLeft = Integer.MAX_VALUE;
        int bottomRight = Integer.MIN_VALUE;
        int upperLeft = Integer.MIN_VALUE;
        int upperRight = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i <= buildingNode; i++)
        {
            int[] buildingCoordinate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (buildingCoordinate[0] != 1 && buildingCoordinate[1] != 1)
            counter += buildingCoordinate[0] + buildingCoordinate[1];
        }
        input.close();
        System.out.print(counter);
    }
}