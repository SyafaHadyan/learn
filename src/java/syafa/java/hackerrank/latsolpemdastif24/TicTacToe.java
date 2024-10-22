package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class TicTacToe
{
    class win
    {
        public static void X()
        {
            System.out.print("X memenangkan permainan.");
            System.exit(0);
        }
        public static void O()
        {
            System.out.print("O memenangkan permainan.");
            System.exit(0);
        }
    }
    public static void draw()
    {
        System.out.println("Tidak ada pemenang.");
        System.exit(0);
    }
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
        /*
         * Upper left
         * X
         */
        if (board[0][0].equalsIgnoreCase("X"))
        {
            // Upper left -> upper right
            if (board[0][1].equalsIgnoreCase("X") && board[0][2].equalsIgnoreCase("X"))
            {
                win.X();
            }
            // Upper left -> bottom left
            if (board[1][0].equalsIgnoreCase("X") && board[2][0].equalsIgnoreCase("X"))
            {
                win.X();
            }
            // Upper left -> bottom right
            if (board[1][1].equalsIgnoreCase("X") && board[2][2].equalsIgnoreCase("X"))
            {
                win.X();
            }
        }
        /*
         * Upper left
         * O
         */
        if (board[0][0].equalsIgnoreCase("O"))
        {
            // Upper left -> upper right
            if (board[0][1].equalsIgnoreCase("O") && board[0][2].equalsIgnoreCase("O"))
            {
                win.O();
            }
            // Upper left -> bottom left
            if (board[1][0].equalsIgnoreCase("O") && board[2][0].equalsIgnoreCase("O"))
            {
                win.O();
            }
            // Upper left -> bottom right
            if (board[1][1].equalsIgnoreCase("O") && board[2][2].equalsIgnoreCase("O"))
            {
                win.O();
            }
        }
        /*
         * Upper mid
         * X
         */
        if (board[0][1].equalsIgnoreCase("X"))
        {
            // Upper mid -> upper left -> upper right
            if (board[0][0].equalsIgnoreCase("X") && board[0][2].equalsIgnoreCase("X"))
            {
                win.X();
            }
            // Upper mid -> mid -> botton mid
            if (board[1][1].equalsIgnoreCase("X") && board[2][1].equalsIgnoreCase("X"))
            {
                win.X();
            }
        }
        /*
         * Upper mid
         * O
         */
        if (board[0][1].equalsIgnoreCase("O"))
        {
            // Upper mid -> upper left -> upper right
            if (board[0][0].equalsIgnoreCase("O") && board[0][2].equalsIgnoreCase("O"))
            {
                win.O();
            }
            // Upper mid -> mid -> botton mid
            if (board[1][1].equalsIgnoreCase("O") && board[2][1].equalsIgnoreCase("O"))
            {
                win.O();
            }
        }
        else
        {
            draw();
        }
    }
}