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
        for (int i = 0; i < obstacleAmount; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                obstacleCoordinate[j] = Integer.parseInt(input.next());
            }
        }
        String[] playerMovement = input.nextLine().split(" ");
        input.close();
    }
}