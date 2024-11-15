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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < GAME_BOARD_SIZE; i++)
        {
            gameBoard[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}