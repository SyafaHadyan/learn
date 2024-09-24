import java.util.*;

public class HitunganHari
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan jumlah hari",':');
        int jumlahHari = Integer.parseInt(input.nextLine());
        input.close();
    }
}