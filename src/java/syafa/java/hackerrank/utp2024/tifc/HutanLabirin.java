package syafa.java.hackerrank.utp2024.tifc;
import java.util.*;

public class HutanLabirin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int step = Integer.parseInt(input.nextLine());
        input.close();
        int counter = 0;
        int number = start;
        while (counter != step || number < 1000)
        {
            counter++;
            if (number == 0 || number % 2 == 0)
            {
                number /= 2;
            }
            else if (number % 2 != 0)
            {
                number *= 10;
            }
        }
        if (number < 1000)
        {
            System.out.print("Pemain terjebak setelah" + ' ' + counter + ' ' + "langkah");
            return;
        }
        System.out.print("Pemain keluar setelah" + ' ' + counter + ' ' + "langkah");
    }
}