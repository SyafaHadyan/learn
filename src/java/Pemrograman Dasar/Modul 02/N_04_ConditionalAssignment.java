import java.util.*;

public class N_04_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan nama anda",':');
        String nama = input.nextLine();
        System.out.printf("%-30s%-2c","Masukkan password anda",':');
        String password = input.nextLine();
        System.out.printf("\n%-30s%-2c","Masukkan ulang nama anda",':');
        String cekNama = input.nextLine();
        System.out.printf("%-30s%-2c","Masukkan ulang password anda",':');
        String cekPassword = input.nextLine();
        input.close();
        if (nama.equals(cekNama) && password.equals(cekPassword))
        {
            System.out.printf("%.30s\n","==============================");
            System.out.printf("\n%-30s%-2c%s\n","Nama anda adalah",':',nama);
            System.out.printf("%-30s%-2c%s\n","Password anda adalah",':',password);
            System.out.printf("%.30s\n","==============================");
        }
        else if (!nama.equals(cekNama) || !password.equals(cekPassword))
        {
            System.out.print("Data tidak ditemukan");
        }
    }
}