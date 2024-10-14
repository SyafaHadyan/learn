package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DBajakLaut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arraySize = input.nextLine().split(" ");
        String[] treasureCoordinate = input.nextLine().split(" ");
        int obstacleAmount = Integer.parseInt(input.nextLine());
        int[] obstacleCoordinate = new int[obstacleAmount * 2];
        char[][] map = new char[Integer.parseInt(arraySize[0])][Integer.parseInt(arraySize[1])];
        for (int i = 0; i < Integer.parseInt(arraySize[0]); i++)
        {
            for (int j = 0; j < Integer.parseInt(arraySize[1]); j++)
            {
                map[i][j] = '.';
            }
        }
        for (int i = 0; i < obstacleAmount; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                obstacleCoordinate[j] = Integer.parseInt(input.next());
            }
            for (int j = 0; j < 2; j++)
            {
                map[obstacleCoordinate[0]][obstacleCoordinate[1]] = '#';
            }
        }
        input.nextLine();
        ArrayList<String> playerMovement = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        for (int i = 0; i < playerMovement.size(); i++)
        {
            //
        }
        input.close();
        map[Integer.parseInt(treasureCoordinate[0])][Integer.parseInt(treasureCoordinate[1])] = 'X';
        for (int i = 0; i < Integer.parseInt(arraySize[0]); i++)
        {
            for (int j = 0; j < Integer.parseInt(arraySize[1]); j++)
            {
                System.out.print(map[i][j]);
            }
            if (i != Integer.parseInt(arraySize[0]) - 1)
            {
                System.out.print("\n");
            }
        }
    }
}