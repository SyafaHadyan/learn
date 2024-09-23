import java.util.*;

public class For
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan jumlah pengulangan",':');
        int jumlahPengulangan = Integer.parseInt(input.nextLine());
        int total = 0;
        input.close();
        for (int i = 1; i <= jumlahPengulangan; i++)
        {
            System.out.println(i);
            total = total + i;
        }
        System.out.printf("%-7s%-2c%d","Total",':',total);
    }
}