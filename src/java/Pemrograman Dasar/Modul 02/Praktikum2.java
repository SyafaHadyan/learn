import java.util.*;

public class Praktikum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String mataUang = "Rp.";
        int jamKerja = 0;
        int upahPerJam = 5000;
        int lemburPerJam = 6000;
        int dendaPerJam = 0;
        int upahTotal = 0;
        int dendaTotal = 0;
        input.close();
        while (true)
        {
            System.out.printf("%-20s%-2c","Jam kerja",':');
            jamKerja = Integer.parseInt(input.nextLine());
            if (jamKerja >= 50 && jamKerja <= 60)
            {
                upahTotal = upahPerJam * jamKerja;
            }
            else if (jamKerja > 60)
            {
                upahTotal = (upahPerJam * 50) + (lemburPerJam * (jamKerja - 60));
            }
            else if (jamKerja < 50)
            {
                upahTotal = upahPerJam * jamKerja;
                dendaTotal = dendaPerJam * jamKerja;
            }
            System.out.printf("%-20s%c%c%c%s%c%d");
        }
    }
}