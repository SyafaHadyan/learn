import java.util.*;

public class N_03_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null";
        System.out.println(s+" "+val);
        boolean cekInput = true;
        String namaMahasiswa = "Nama";
        String nimMahasiswa = "0";
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nama anda",':');
            namaMahasiswa = input.nextLine();
            if (namaMahasiswa == "" || namaMahasiswa.equalsIgnoreCase("Korlap"))
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
            else
            {
                System.out.printf("%s%c%c%s%c%c%s\n","Nim yang anda masukkan",' ','[',nimMahasiswa,']',' ',"Salah, harap masukkan nim kembali");
                cekInput = true;
            }
        }
        System.out.printf("%-20s%-2c%s\n","Nama anda adalah",':',namaMahasiswa);
        System.out.printf("%-20s%-2c%s","Nim anda adalah",':',nimMahasiswa);
        input.close();
    }
}