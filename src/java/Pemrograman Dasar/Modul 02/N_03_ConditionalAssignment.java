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
            cekInput = true;
            if (namaMahasiswa != "")
            {
                cekInput = false;
            }
        }
    }
}