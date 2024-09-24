import java.util.*;

public class N_03_ConditionalAssignment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean cekInput = true;
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null";
        System.out.println(s+" "+val);
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nama anda",':');
            String namaMahasiswa = input.nextLine();
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
        while (cekInput)
        {
            System.out.printf("%-20s%-2c","Masukkan nim anda",':');
            String nimMahasiswa = input.nextLine();
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
    }
}