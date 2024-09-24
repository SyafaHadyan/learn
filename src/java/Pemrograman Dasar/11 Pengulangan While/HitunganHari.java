import java.util.*;

public class HitunganHari
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan jumlah hari",':');
        int jumlahHari = Integer.parseInt(input.nextLine());
        input.close();
        int i = 0;
        for (i = 1; i <= jumlahHari; i++)
        {
            int hariKe = i;
            if (hariKe < 7)
            {
                System.out.println(hariKe);
            }
            else if (i == 7)
            {
                System.out.println(hariKe);
                hariKe = 1;
            }
        }
    }
}