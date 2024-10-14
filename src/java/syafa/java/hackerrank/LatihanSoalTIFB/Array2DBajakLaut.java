package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DBajakLaut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> playerPositionResult = new ArrayList<>();
        int[] currentPlayerPosition = {0,0};
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
        map[Integer.parseInt(treasureCoordinate[0])][Integer.parseInt(treasureCoordinate[1])] = 'X';
        ArrayList<String> playerMovement = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        for (int i = 0; i < playerMovement.size(); i++)
        {
            if (playerMovement.get(i).equalsIgnoreCase("Kanan"))
            {
                if (map[currentPlayerPosition[1]][currentPlayerPosition[1] + 1] == '#')
                {
                    playerPositionResult.add(
                    "Pemain tidak bisa melewati koordinat" + " " +
                    "(" + currentPlayerPosition[1] + "," + (currentPlayerPosition[1] + 1) + ")");
                    continue;
                }
                else if (map[currentPlayerPosition[1]][currentPlayerPosition[1] + 1] == 'X')
                {
                    playerPositionResult.add(
                    "Pemain menemukan harta karun pada koordinat" + " " +
                    "(" + currentPlayerPosition[1] + "," + (currentPlayerPosition[1] + 1) + ")");
                }
                currentPlayerPosition[1] = currentPlayerPosition[1] + 1;
                continue;
            }
            else if (playerMovement.get(i).equalsIgnoreCase("Kiri"))
            {
                if (map[currentPlayerPosition[1]][currentPlayerPosition[1] - 1] == '#')
                {
                    playerPositionResult.add(
                    "Pemain tidak bisa melewati koordinat" + " " +
                    "(" + currentPlayerPosition[1] + "," + (currentPlayerPosition[1] - 1) + ")");
                    continue;
                }
                else if (map[currentPlayerPosition[1]][currentPlayerPosition[1] - 1] == 'X')
                {
                    playerPositionResult.add(
                    "Pemain menemukan harta karun pada koordinat" + " " +
                    "(" + currentPlayerPosition[1] + "," + (currentPlayerPosition[1] - 1) + ")");
                }
                currentPlayerPosition[1] = currentPlayerPosition[1] - 1;
                continue;
            }
            else if (playerMovement.get(i).equalsIgnoreCase("Atas"))
            {
                if (map[currentPlayerPosition[0]][currentPlayerPosition[0] - 1] == '#')
                {
                    playerPositionResult.add(
                    "Pemain tidak bisa melewati koordinat" + " " +
                    "(" + currentPlayerPosition[0] + "," + (currentPlayerPosition[0] - 1) + ")");
                    continue;
                }
                else if (map[currentPlayerPosition[0]][currentPlayerPosition[0] - 1] == 'X')
                {
                    playerPositionResult.add(
                    "Pemain menemukan harta karun pada koordinat" + " " +
                    "(" + currentPlayerPosition[0] + "," + (currentPlayerPosition[0] - 1) + ")");
                }
                currentPlayerPosition[0] = currentPlayerPosition[0] - 1;
                continue;
            }
            else if (playerMovement.get(i).equalsIgnoreCase("Bawah"))
            {
                if (map[currentPlayerPosition[0]][currentPlayerPosition[0] + 1] == '#')
                {
                    playerPositionResult.add(
                    "Pemain tidak bisa melewati koordinat" + " " +
                    "(" + currentPlayerPosition[0] + "," + (currentPlayerPosition[0] + 1) + ")");
                    continue;
                }
                else if (map[currentPlayerPosition[0]][currentPlayerPosition[0] + 1] == 'X')
                {
                    playerPositionResult.add(
                    "Pemain menemukan harta karun pada koordinat" + " " +
                    "(" + currentPlayerPosition[0] + "," + (currentPlayerPosition[0] + 1) + ")");
                }
                currentPlayerPosition[0] = currentPlayerPosition[0] + 1;
                continue;
            }
        }
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