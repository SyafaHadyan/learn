package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[3][];
        for (int i = 0; i < board.length; i++)
        {
            board[i] = input.nextLine().split(" ");
        }
        input.close();
    }
}