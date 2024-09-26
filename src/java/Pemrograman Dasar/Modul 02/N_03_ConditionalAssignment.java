import java.util.*;

public class N_03_ConditionalAssignment
{
    class dataMahasiswa
    {
        String namaMahasiswa = "Syafa Hadyan Rasendriya";
        double nimMahasiswa = 245150207111047d;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = "Filkom";
        String val = (s.equalsIgnoreCase("Filkom"))?"Brawijaya": "null";
        System.out.println(s+" "+val);
        boolean cekInput = true;
        String namaMahasiswa = "";
        String nimMahasiswa = "";
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nama anda",':');
            namaMahasiswa = input.nextLine();
            if (namaMahasiswa == "")
            {
                System.out.printf("%s%c%c%s%c%c%s\n","Nama yang anda masukkan",' ','[',namaMahasiswa,']',' ',"Salah, harap masukkan nama kembali");
                cekInput = true;
            }
            else
            {
                cekInput = false;
            }
        }
        cekInput = true;
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nim anda",':');
            nimMahasiswa = input.nextLine();
            if (nimMahasiswa.length() == 15)
            {
                cekInput = false;
            }
            else if (nimMahasiswa.length() != 15)
            {
                System.out.printf("%s%c%c%s%c%c%s\n","Nim yang anda masukkan",' ','[',nimMahasiswa,']',' ',"Salah, harap masukkan nim kembali dan cek jumlah digit nim anda");
                cekInput = true;
            }
        }
        input.close();
        System.out.printf("\n%-20s%-2c%s\n","Nama anda adalah",':',namaMahasiswa);
        System.out.printf("%-20s%-2c%s","Nim anda adalah",':',nimMahasiswa);
    }
}