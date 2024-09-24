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
            int nimMahasiswa = Integer.parseInt(input.nextLine());
            if (nimMahasiswa != 0)
            {
                cekInput = false;
            }
        }
    }
}