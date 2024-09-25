import java.util.*;

public class HitunganHari
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan jumlah hari",':');
        int jumlahHari = Integer.parseInt(input.nextLine());
        input.close();
        int i = 1;
        int hariKe = i;
        for (i = 1; i <= jumlahHari; i++)
        {
            if (hariKe <= 6)
            {
                System.out.println(hariKe);
                hariKe++;
            }
            else if (hariKe == 7)
            {
                System.out.println(hariKe);
                hariKe -= 6;
            }
        }
    }
}