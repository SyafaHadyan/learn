import java.util.Scanner; public class N_06_IfElse
{
    public static void main(String[] args)
    {
        boolean ulang = true;
        while (ulang)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%-30s%-2c","Masukkan nilai anda (-1) untuk keluar",':');
            /*
            try
            {
                int nilai = in.nextInt();
            }
            catch
            {

            }
             */
            if (nilai > 60)
            {
                System.out.println("Anda lulus");
            }
            else if (nilai >= 40)
            {
                System.out.println("Anda harus mengulang !");
            }
            else if (nilai == -1)
            {
                ulang = false;
                in.close();
            }
            else
            {
                System.out.println("Anda gagal");
            }
        }
    }
}