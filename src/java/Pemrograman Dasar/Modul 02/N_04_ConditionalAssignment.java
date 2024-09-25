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
            System.out.printf("\n%.20s%c%s%c%.20s\n",headerFooter,' ',"Biodata Mahasiswa",' ',headerFooter);
            System.out.printf("%s%58s\n",sideBorder,sideBorder);
            System.out.printf("%-5s%58s%-30s%-2c%s%58s\n",sideBorder,sideBorder,"Nama mahasiswa",':',nama);
            System.out.printf("%-5s%58s%-30s%-2c%s%58s\n",sideBorder,sideBorder,"Password",':',password);
            System.out.printf("%-5s%58s%-30s%-2c%.0f%58s\n",sideBorder,sideBorder,"NIM mahasiswa",':',nim);
            System.out.printf("%-5s%58s%-30s%-2c%.2f%58s\n",sideBorder,sideBorder,"IPK mahasiswa",':',IPK);
            System.out.printf("%s%58s\n",sideBorder,sideBorder);
            System.out.printf("%.59s\n",headerFooter);
        }
        else if (!nama.equals(cekNama) || !password.equals(cekPassword))
        {
            System.out.print("Data tidak ditemukan");
        }
    }
}