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
        ArrayList<String> divisible = new ArrayList<>();
        for (int i = 0; i < magicNumber.length; i++)
        {
            if ((number[number.length - 1] - number[0]) % magicNumber[i] == 0)
            {
                divisible.add(String.valueOf(magicNumber[i]));
            }
        }
        if (divisible.size() == 0)
        {
            divisible.add("Tidak ada");
            divisible.add("Jackpot!!!");
        }
        else
        {
            divisible.add(0,"Habis dibagi ");
            if (divisible.size() == 6)
            {
                divisible.add("Jackpot!!!");
            }
            else
            {
                divisible.add("Belum hoki!");
            }
        }
        for (int i = 0; i < divisible.size(); i++)
        {
            if (i == 0)
            {
                System.out.println("Terbesar" + " " + number[number.length - 1] + "\n" +
                                    "Terkecil" + " " + number[0] +
                                    "Selisih" + " " + (number[number.length - 1] - number[0]));
            }
        }
    }
}