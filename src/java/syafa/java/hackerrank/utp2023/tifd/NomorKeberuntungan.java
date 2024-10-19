package syafa.java.hackerrank.utp2023.tifd;
import java.util.*;
import java.util.stream.*;

public class NomorKeberuntungan
{
    public static void main(String[] args)
    {
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
        }
        else
        {
            divisible.add(0,"Habis dibagi");
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
                                    "Terkecil" + " " + number[0] + "\n" +
                                    "Selisih" + " " + number[number.length - 1] + " " + "-" + " " + number[0] + " " + "=" + " " + 
                                    (number[number.length - 1] - number[0]));
            }
            if (divisible.get(0).equalsIgnoreCase("Tidak ada"))
            {
                System.out.print("Tidak ada" + "\n" + "Jackpot!!!");
                return;
            }
            System.out.print(divisible.get(i));
            if ((divisible.size() - i != 1) && (divisible.size() - i != 2))
            {
                System.out.print(' ');
            }
            if (divisible.size() - i == 2)
            {
                System.out.print("\n");
            }
        }
    }
}