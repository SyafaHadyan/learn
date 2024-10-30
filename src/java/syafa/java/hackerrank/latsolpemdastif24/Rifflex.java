package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

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
         * A  B  C  D  E  F  G  H
         * 2S 3S 4S 5S 2D 3D 4D 5D
         * 
         * G  B  E  D  F  A  H  C 
         * 4D 3S 2D 5S 3D 2S 5D 4S
         */
        Scanner input = new Scanner(System.in);
        String[] card = input.nextLine().split("\s");
        input.close();
        for (int i = 0; i < card.length; i++)
        {
            try
            {
                if ((i + 1) % 2 == 0)
                {
                    String temp = card[(3 * (i + 1) + 1) - 1];
                    card[(3 * (i + 1) + 1) - 1] = card[i];
                    card[i] = temp;
                }
                else if ((i + 1) % 2 != 0)
                {
                    String temp = card[((i + 1) / 2) - 1];
                    card[((i + 1) / 2) - 1] = card[i];
                    card[i] = temp;
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                //
            }
        }
    }
}