import java.util.*;

public class N_06_IfElse
{
    public static void main(String[] args)
    {
        boolean ulang = true;
        while (ulang)
        {
            int nilai = 0;
            @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
            System.out.printf("%-40s%-2c","Masukkan nilai anda",':');
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
                System.out.println("Anda harus mengulang !");
            }
            else
            {
                System.out.println("Anda gagal");
            }
        }
    }
}