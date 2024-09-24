import java.util.*;

public class N_07_IfElse
{
    public static void main(String[] args)
    {
        boolean ulang = true;
        while (ulang)
        {
            int nilai = 0;
            Scanner in = new Scanner(System.in);
            System.out.printf("%-30s%-2c","Masukkan nilai anda (Q) untuk keluar",':');
            try
            {
                nilai = in.nextInt();
            }
            catch (InputMismatchException e)
            {
                in.close();
                return;
            }
            if (nilai > 60)
            {
                System.out.println("Anda lulus");
            }
            else if (nilai >= 40)
            {
                System.out.println("Nilai kurang!");
            }
            else
            {
                System.out.println("Anda gagal");
            }
        }
    }
}