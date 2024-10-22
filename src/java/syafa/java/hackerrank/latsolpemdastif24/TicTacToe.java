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
        // Upper left
        if (board[0][0].equalsIgnoreCase("X"))
        {
            // Upper left -> upper right
            if (board[0][1].equalsIgnoreCase("X") && board[0][1].equalsIgnoreCase("X"))
            {
                System.out.print("X memenangkan permainan.");
                return;
            }
            // Upper left -> bottom left
            if (board[1][1].equalsIgnoreCase("X") && board[1][2].equalsIgnoreCase("X"))
            {
                System.out.print("X memenangkan permainan.");
                return;
            }
        }
    }
}