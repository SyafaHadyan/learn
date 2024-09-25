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
        int dendaPerJam = 1000;
        while (true)
        {
            int upahTotal = 0;
            int lemburTotal = 0;
            int dendaTotal = 0;
            int total = 0;
            System.out.printf("%-20s%-2c","Jam kerja",':');
            try
            {
                jamKerja = Integer.parseInt(input.nextLine());
            }
            catch (NumberFormatException e)
            {
                input.close();
                return;
            }
            if (jamKerja >= 50 && jamKerja <= 60)
            {
                upahTotal = upahPerJam * jamKerja;
                total = upahTotal + lemburTotal - dendaTotal;
            }
            else if (jamKerja > 60)
            {
                upahTotal = (upahPerJam * 60);
                lemburTotal = lemburPerJam * (jamKerja - 60);
                total = upahTotal + lemburTotal - dendaTotal;
            }
            else if (jamKerja < 50)
            {
                upahTotal = upahPerJam * jamKerja;
                dendaTotal = dendaPerJam * (50 - jamKerja);
                total = upahTotal + lemburTotal - dendaTotal;
            }
            System.out.printf("%-20s%c%c%s%c%d\n","Upah",'=',' ',mataUang,' ',upahTotal);
            System.out.printf("%-20s%c%c%s%c%d\n","Lembur",'=',' ',mataUang,' ',lemburTotal);
            System.out.printf("%-20s%c%c%s%c%d\n","Denda",'=',' ',mataUang,' ',dendaTotal);
            System.out.println("---------------------");
            System.out.printf("%-20s%c%c%s%c%d\n\n","Total",'=',' ',mataUang,' ',total);
        }
    }
}