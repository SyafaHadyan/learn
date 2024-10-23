package syafa.java.hackerrank.kualifikasisrifoton2024;
import java.util.*;

public class PermainanKartu
{
    static class game
    {
        private static int checkCard(char turf,char firstCardType,char secondCardType,char firstCardValue,char secondCardValue)
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        /*
         * H
         * 3H 9S
         * 
         * 1
         * 
         * Jenis truf: H (Hati) Kartu pertama: "3H", yang memiliki peringkat 3 dan jenis Hati. Kartu kedua: "9S", yang memiliki peringkat 9 dan jenis Sekop.
         * Kartu pertama adalah kartu truf karena jenisnya adalah Hati (H), yang merupakan jenis truf dan Kartu kedua adalah Sekop (S), yang bukan jenis truf.
         * Berdasarkan aturan permainan, kartu truf selalu menang melawan kartu non-truf, tidak peduli berapa peringkatnya.
         * 
         * Pass player cardType and val to method
         */
        Scanner input = new Scanner(System.in);
        char turf = input.nextLine().charAt(0);
        String[] match = input.nextLine().split(" ");
        System.out.print(game.checkCard(turf,0,0));
        input.close();
    }
}