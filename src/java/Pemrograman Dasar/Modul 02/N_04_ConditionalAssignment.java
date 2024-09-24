import java.util.*;

public class N_04_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-25s%-2c","Masukkan nama anda",':');
        String nama = input.nextLine();
        System.out.printf("%-25s%-2c","Masukkan password anda",':');
        String password = input.nextLine();
        boolean dataValid = false;
        System.out.printf("%-25s%-2c","Masukkan ulang nama anda",':');
        String cekNama = input.nextLine();
        System.out.printf("%-25s%-2c","Masukkan ulang password anda",':');
        String cekPassword = input.nextLine();
        if (nama == cekNama && password == cekPassword)
        {
            dataValid = true;
            System.out.printf("%.5s\n","==============================");

        }
        else
        {
            dataValid = false;
            System.out.print("Data tidak ditemukan");
        }
    }
}