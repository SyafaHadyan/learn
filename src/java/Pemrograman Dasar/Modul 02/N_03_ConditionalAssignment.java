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
            System.out.printf("%-25s%-2c","Masukkan nama anda",':');
            String namaMahasiswa = input.nextLine();
            if (namaMahasiswa == "" || namaMahasiswa.equalsIgnoreCase("Korlap"))
            {
                System.out.printf("%s%c%s%c%s","Nama yang anda masukkan",' ',namaMahasiswa,' ',"Salah, harap masukkan nama kembali");
                cekInput = true;
            }
            else
            {
                cekInput = false;
            }
            System.out.printf("%-25s%-2c","Masukkan nim anda",':');
            double nimMahasiswa = Double.parseDouble(input.nextLine());
            String nimMahasiswaString = Double.toString(nimMahasiswa);
            if (nimMahasiswaString.length() == 15)
            {
                cekInput = false;
            }
            else
            {
                System.out.printf("%s%c%d%c%s","Nim yang anda masukkan",' ',nimMahasiswa,' ',"Salah, harap masukkan nim kembali");
                cekInput = true;
            }
        }
    }
}