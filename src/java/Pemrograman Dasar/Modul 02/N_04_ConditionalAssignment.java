import java.util.*;

public class N_04_ConditionalAssignment
{
    public static void main(String[] args)
    {
        String nama = "";
        String password = "";
        String cekNama = "";
        String cekPassword = "";
        String headerFooter = "============================================================";
        String sideBorder = "|";
        double nim = 245150207111047.0;
        double IPK = 3.98;
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
            System.out.printf("\n%.20s%c%s%c%.20s\n",headerFooter,' ',"Biodata Mahasiswa",' ',headerFooter);
            System.out.printf("%s%58s\n",sideBorder,sideBorder);
            System.out.printf("%-5s%-30s%-2c%s%58s\n",sideBorder,"Nama mahasiswa",':',nama,sideBorder);
            System.out.printf("%-5s%-30s%-2c%s%58s\n",sideBorder,"Password",':',password,sideBorder);
            System.out.printf("%-5s%-30s%-2c%.0f%58s\n",sideBorder,"NIM mahasiswa",':',nim,sideBorder);
            System.out.printf("%-5s%-30s%-2c%.2f%58s\n",sideBorder,"IPK mahasiswa",':',IPK,sideBorder);
            System.out.printf("%s%58s\n",sideBorder,sideBorder);
            System.out.printf("%.59s\n",headerFooter);
        }
        else if (!nama.equals(cekNama) || !password.equals(cekPassword))
        {
            System.out.print("Data tidak ditemukan");
        }
    }
}