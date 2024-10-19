package syafa.java.hackerrank.utp2023.tifd;
import java.util.*;
import java.util.stream.*;

public class NomorKeberuntungan
{
    public static void main(String[] args)
    {
        /*
         * 1 2 7
         * 
         * Terbesar 7
         * Terkecil 1
         * Selisih 7 - 1 = 6
         * Habis dibagi 2 3
         * Belum hoki!
         * 
         * 11 2 19
         * 
         * Terbesar 19
         * Terkecil 2
         * Selisih 19 - 2 = 17
         * Tidak ada
         * Jackpot!!!
         * 
         * 2 3 5 7 11
         * if divisible by 1-4 of num, not jack
         * else if not divisible by any of num or divisible by all of num, jack
         */
        Scanner input = new Scanner(System.in);
        int[] magicNumber = {2, 3, 5, 7, 11};
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(number);
        ArrayList<Integer> divisible = new ArrayList<>();
        for (int i = 0; i < number.length; i++)
        {
            for (int j = 0; j < magicNumber.length; j++)
            {
                if (number[i] % magicNumber[j] == 0)
                {
                    //
                }
            }
        }
    }
}