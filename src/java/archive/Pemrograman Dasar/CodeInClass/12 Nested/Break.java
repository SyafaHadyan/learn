import java.util.*;

public class Break
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s%-2c","Mulai",':');
        int mulai = Integer.parseInt(input.nextLine());
        System.out.printf("%-10s%-2c","Akhir",':');
        int akhir = Integer.parseInt(input.nextLine());
        System.out.printf("%-10s%-2c","Break",':');
        int keluar = Integer.parseInt(input.nextLine());
        input.close();
        while (mulai <= akhir && akhir >= keluar)
        {
            if (mulai == keluar)
            {
                System.out.print("Break");
                break;
            }
            else if (mulai != akhir)
            {
                System.out.print(mulai);
                System.out.println(' ' + "Terus");
                mulai++;
            }
        }
    }
}