package syafa.java.codingquest.practice2022;
import java.util.*;
import java.util.stream.*;

public class SnakesAndLadders
{
    static final int GAME_BOARD_SIZE = 6;
    static final int GAME_ROUND = 20;
    static final int PLAYER_AMOUNT = 2;
    static int[][] gameBoard = new int[GAME_BOARD_SIZE][GAME_BOARD_SIZE];
    static int[] gameBoardFlat = new int[GAME_BOARD_SIZE * GAME_BOARD_SIZE];
    static int[] playerPosition = new int[PLAYER_AMOUNT];
    static int gameBoardFlatIndexCounter = 0;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int winPlayer = 0;
        for (int i = 0; i < gameBoard.length; i++)
        {
            gameBoard[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = gameBoard.length - 1; i >= 0; i--)
        {
            if ((i + 1) % 2 == 0)
            {
                for (int j = 0; j < gameBoard[i].length; j++,gameBoardFlatIndexCounter++)
                {
                    gameBoardFlat[gameBoardFlatIndexCounter] = gameBoard[i][j];
                }
            }
            else if ((i + 1) % 2 != 0)
            {
                for (int j = gameBoard[i].length - 1; j >= 0; j--,gameBoardFlatIndexCounter++)
                {
                    gameBoardFlat[gameBoardFlatIndexCounter] = gameBoard[i][j];
                }
            }
        }
        for (int i = 0; i < GAME_ROUND; i++)
        {
            for (int j = 0; j < playerPosition.length; j++)
            {
                int inputPlayer = input.nextInt();
                int currentIndex = inputPlayer;
                int posIncrement = 0;
                do
                {
                    try
                    {
                        currentIndex = gameBoardFlat[inputPlayer + playerPosition[j]];
                        playerPosition[j] += inputPlayer + currentIndex;
                        posIncrement = gameBoardFlat[playerPosition[j]];
                        inputPlayer = 0;
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        if (winPlayer == 0)
                        {
                            winPlayer = (j + 1) * (i + 1);
                        }
                    }
                }
                while (posIncrement != 0);
            }
            input.nextLine();
        }
        input.close();
        System.out.print(winPlayer);
    }
}