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
        String cekNama = "";
        String cekPassword = "";
        System.out.printf("%-25s%-2c","Masukkan nama anda",':');
        cekNama = input.nextLine();
        System.out.printf("%-25s%-2c","Masukkan password anda",':');
        cekPassword = input.nextLine();
        if (nama == cekNama && password == cekPassword)
        {
            dataValid = true;
            System.out.printf("%.30s","==============================");
        }
        else
        {
            dataValid = false;
            System.out.print("Data tidak ditemukan");
        }
    }
}