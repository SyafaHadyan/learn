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
        for (int i = bilanganAwal; i <= batasBilangan; i += 3)
        {
            
        }
    }
}