package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class TicTacToe
{
    public static void main(String[] args)
    {
        /*
         * X O O
         * X O X
         * X X O
         * 
         * X memenangkan permainan.
         * 
         * X O O
         * X X O
         * O X O
         * 
         * O memenangkan permainan.
         * 
         * else
         * 
         * Tidak ada pemenang.
         */
        Scanner input = new Scanner(System.in);
        String[][] board = new String[3][];
        for (int i = 0; i < board.length; i++)
        {
            board[i] = input.nextLine().split(" ");
        }
        input.close();
    }
}