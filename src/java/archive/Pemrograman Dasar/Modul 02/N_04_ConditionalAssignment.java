import java.util.*;
import java.util.concurrent.*;
public class N_04_ConditionalAssignment
{
    public static void main(String[] args)
    {
        String nama = "";
        String password = "";
        String cekNama = "";
        String cekPassword = "";
        String headerFooter = "======================================================================";
        final String leftBorder = "|";
        final double nim = 245150207111047.0;
        double IPK = ThreadLocalRandom.current().nextDouble(3.50,4.00);
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan nama anda",':');
        nama = input.nextLine();
        System.out.printf("%-30s%-2c","Masukkan password anda",':');
        password = input.nextLine();
        System.out.printf("\n%-30s%-2c","Masukkan ulang nama anda",':');
        cekNama = input.nextLine();
        System.out.printf("%-30s%-2c","Masukkan ulang password anda",':');
        cekPassword = input.nextLine();
        input.close();
        if (nama.equals(cekNama) && password.equals(cekPassword))
        {
            System.out.printf("\n%.25s%c%s%c%.25s\n",headerFooter,' ',"Biodata Mahasiswa",' ',headerFooter);
            System.out.printf("%s\n",leftBorder);
            System.out.printf("%-5s%-30s%-2c%s\n",leftBorder,"Nama mahasiswa",':',nama);
            System.out.printf("%-5s%-30s%-2c%s\n",leftBorder,"Password",':',password);
            System.out.printf("%-5s%-30s%-2c%.0f\n",leftBorder,"NIM mahasiswa",':',nim);
            System.out.printf("%-5s%-30s%-2c%.2f\n",leftBorder,"IPK mahasiswa",':',IPK);
            System.out.printf("%s\n",leftBorder);
            System.out.printf("%.69s\n",headerFooter);
        }
        else if (!nama.equals(cekNama) || !password.equals(cekPassword))
        {
            System.out.print("Data tidak ditemukan");
        }
    }
}