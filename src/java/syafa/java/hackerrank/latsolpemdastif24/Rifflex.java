package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class Rifflex
{
    public static void main(String[] args)
    {
        /*
         * 2S 3S 4S 5S
         * 
         * Diberikan setumpuk kartu remi. Tugas Anda adalah untuk mengacak tumpukan kartu secara selang-seling kemudian secara "3x+1".
         * Pengacakan "3x+1" sendiri adalah cara mengacak tumpukan kartu dengan menukar kartu sekarang dengan kartu ke-(3x+1)
         * apabila posisi sekarang ganjil dan dengan kartu ke-(x/2) apabila posisi sekarang genap untuk semua kartu.
         * 
         * Kartu berupa string; ada empat macam kartu, Spade (S), Diamond (D), Heart (H), dan Club (C). Input bisa saja kosong.
         * Output Format
         * Kartu-kartu yang dibatasi dengan spasi
         * 
         * 2S 3S 4S 5S 2D 3D 4D 5D
         * 
         * 4D 3S 2D 5S 3D 2S 5D 4S
         * 
         * 1  2  3  4  5  6  7  8
         * 2S 3S 4S 5S 2D 3D 4D 5D
         * 
         * 7  2  5  4  6  1  8  3
         * 4D 3S 2D 5S 3D 2S 5D 4S
         * 
         * 
         * 1  2  3  4  5  6  7  8
         * 2S 3S 4S 5S 2D 3D 4D 5D
         * 
         * 3  5  2  4  7  6  1  8
         * 4S 2D 3S 5S 4D 3D 2S 5D
         * 
         * 1  3  5  7  8  6  4  2
         * 2S 4S 2D 4D 5D 3D 5S 3S
         * 
         * 2S 4S 5S 4D 3S 2D 5D 3D
         */
        Scanner input = new Scanner(System.in);
        String[] card = input.nextLine().split("\s");
        input.close();
        /*
        for (int i = 0; i < card.length; i++)
        {
            try
            {
                if ((i + 1) % 2 == 0)
                {
                    String temp = card[((3 * (i + 1)) + 1)];
                    card[((3 * (i + 1)) + 1)] = card[i];
                    card[i] = temp;
                }
                else if ((i + 1) % 2 != 0)
                {
                    String temp = card[((i + 1) / 2)];
                    card[((i + 1) / 2)] = card[i];
                    card[i] = temp;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                int tempIndex = 0;
                if ((i + 1) % 2 == 0)
                {
                    String temp = card[(((3 * (tempIndex + 1)) + 1))];
                    card[(((3 * (tempIndex + 1)) + 1))] = card[i];
                    card[i] = temp;
                }
                else if ((i + 1) % 2 != 0)
                {
                    String temp = card[(((tempIndex + 1) / 2))];
                    card[(((tempIndex + 1) / 2))] = card[i];
                    card[i] = temp;
                }
            }
            finally
            {
                try
                {
                    if ((i + 1) % 2 == 0)
                    {
                        String temp = card[(((3 * (i + 1)) + 1)) - (card.length * 2)];
                        card[(((3 * (i + 1)) + 1)) - (card.length * 2)] = card[i];
                        card[i] = temp;
                    }
                    else if ((i + 1) % 2 != 0)
                    {
                        String temp = card[(((i + 1) / 2)) - (card.length)];
                        card[(((i + 1) / 2)) - (card.length)] = card[i];
                        card[i] = temp;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
        }
        */
        for (int i = 0; i < card.length; i++)
        {
            System.out.print(card[i]);
            if (card.length - i != 1)
            {
                System.out.print(" ");
            }
        }
    }
}