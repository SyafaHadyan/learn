import java.util.*;

public class N_03_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final String s = "Filkom";
        String val = (s.equalsIgnoreCase("Filkom"))?"Brawijaya": "null";
        boolean cekInput = true;
        final String namaMahasiswa = "Syafa Hadyan Rasendriya";
        final double nimMahasiswa = 245150207111047d;
        String inputNamaMahasiswa = "";
        double inputNimMahasiswa = 0d;
        System.out.println(s+" "+val);
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nama anda",':');
            inputNamaMahasiswa = input.nextLine();
            if (inputNamaMahasiswa.equals(namaMahasiswa))
            {
                cekInput = false;
            }
            else
            {
                System.out.printf("%s%c%c%s%c%c%s\n","Nama yang anda masukkan",' ','[',inputNamaMahasiswa,']',' ',"Salah, harap masukkan nama lengkap anda kembali");
            }
        }
        cekInput = true;
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan NIM anda",':');
            inputNimMahasiswa = Double.parseDouble(input.nextLine());
            if (inputNimMahasiswa == nimMahasiswa)
            {
                cekInput = false;
            }
            else
            {
                System.out.printf("%s%c%c%.0f%c%c%s\n","NIM yang anda masukkan",' ','[',inputNimMahasiswa,']',' ',"Salah, harap masukkan NIM anda kembali");
            }
        }
        input.close();
        System.out.printf("\n%-20s%-2c%s\n","Nama anda adalah",':',namaMahasiswa);
        System.out.printf("%-20s%-2c%s","Nim anda adalah",':',nimMahasiswa);
    }
}