import java.util.*;

public class BilanganGanjil
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan bilangan awal",':');
        int bilanganAwal = Integer.parseInt(input.nextLine());
        System.out.printf("%-25s%-2c","Masukkan batas bilangan",':');
        int batasBilangan = Integer.parseInt(input.nextLine());
        input.close();
        int moduloBilanganAwal = 0;
        int totalBilangan = 0;
        if (bilanganAwal % 2 == 0)
        {
            moduloBilanganAwal = bilanganAwal + 1;
        }
        else
        {
            moduloBilanganAwal = bilanganAwal;
        }
        for (int i = moduloBilanganAwal; i <= batasBilangan; i += 2)
        {
            System.out.println(i);
            totalBilangan = totalBilangan + i;
        }
        System.out.printf("%-7s%-2c%d","Total",':',totalBilangan);
    }
}