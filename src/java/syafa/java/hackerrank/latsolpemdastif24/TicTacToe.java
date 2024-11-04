package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class TicTacToe
{
    static class checkBoard
    {
        public static boolean checkWin(String[][] board,String player)
        {
            for (int i = 0; i < board.length; i++)
            {
                if (board[i][0].equalsIgnoreCase(player) && board[i][1].equalsIgnoreCase(player) && board[i][2].equalsIgnoreCase(player))
                {
                    return true;
                }
                if (board[0][i].equalsIgnoreCase(player) && board[1][i].equalsIgnoreCase(player) && board[2][i].equalsIgnoreCase(player))
                {
                    return true;
                }
            }
            if (board[0][0].equalsIgnoreCase(player) && board[1][1].equalsIgnoreCase(player) && board[2][2].equalsIgnoreCase(player))
            {
                return true;
            }
            if (board[2][0].equalsIgnoreCase(player) && board[1][1].equalsIgnoreCase(player) && board[0][2].equalsIgnoreCase(player))
            {
                return true;
            }
            return false;
        }
    }
    static class gameStatus
    {
        public static void x()
        {
            System.out.print("X memenangkan permainan.");
            System.exit(0);
        }
        public static void o()
        {
            System.out.print("O memenangkan permainan.");
            System.exit(0);
        }
        public static void draw()
        {
            System.out.println("Tidak ada pemenang.");
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] board = new String[3][];
        for (int i = 0; i < board.length; i++)
        {
            board[i] = input.nextLine().split(" ");
        }
        input.close();
        if (checkBoard.checkWin(board,"X"))
        {
            gameStatus.x();
        }
        if (checkBoard.checkWin(board,"O"))
        {
            gameStatus.o();
        }
        else
        {
            gameStatus.draw();
        }
    }
}