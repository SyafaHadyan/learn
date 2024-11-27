package syafa.java.eling.remedialutp2024;
import java.util.Scanner;

public class HutanLabirin
{
    static final int VALUE_LIMIT = 1000;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int initialValue = input.nextInt(); input.nextLine();
        int stepLimit = input.nextInt();
        input.close();
        for (int i = 1; i <= stepLimit; i++)
        {
            if (initialValue % 2 == 0)
            {
                initialValue /= 2;
            }
            else
            {
                initialValue *= 10;
            }
            if (initialValue > VALUE_LIMIT)
            {
                System.out.print("Berhasil keluar pada langkah ke" + "-" + i);
                return;
            }
        }
        System.out.print("Terjebak setelah" + " " + stepLimit + " " + "langkah");
    }
}