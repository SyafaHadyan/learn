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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < gameBoard.length; i++)
        {
            gameBoard[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 1; i <= gameBoard.length; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < gameBoard[i].length; j++)
                {
                    //
                }
            }
            else if (i % 2 != 0)
            {
                for (int j = gameBoard[i].length - 1; j >= 0; j--)
                {
                    //
                }
            }
        }
        input.close();
    }
}