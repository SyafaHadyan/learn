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
        String headerFooter = "============================================================";
        String sideBorder = "|";
        double nim = 245150207111047.0;
        double IPK = 3.98;
        if (nama.equals(cekNama) && password.equals(cekPassword))
        {
            System.out.printf("%.20s%c%s%c%.20s\n\n",headerFooter,' ',"Biodata Mahasiswa",' ',headerFooter);
            System.out.printf("%s%-30s%-2c%s\n",sideBorder,"Nama mahasiswa",':',nama);
            System.out.printf("%s%-30s%-2c%s\n",sideBorder,"Password",':',password);
            System.out.printf("%s%-30s%-2c%.0f\n",sideBorder,"NIM mahasiswa",':',nim);
            System.out.printf("%s%-30s%-2c%.2f\n",sideBorder,"IPK mahasiswa",':',IPK);
            System.out.printf("\n%.59s\n",headerFooter);
        }
        else if (!nama.equals(cekNama) || !password.equals(cekPassword))
        {
            System.out.print("Data tidak ditemukan");
        }
    }
}