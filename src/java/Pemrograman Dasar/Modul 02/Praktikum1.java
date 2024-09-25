import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String unitBerat = "(kg)";
        String unitTinggi = "(m)";
        String outBerat = "Berat badan" + ' ' + unitBerat;
        String outTinggi = "Tinggi badan" + ' ' + unitTinggi;
        double IMT = 0;
        boolean ulang = true;
        while (ulang)
        {
            System.out.printf("%-17s%-2c",outBerat,':');
            try
            {
                double beratBadan = Double.parseDouble(input.nextLine());
            }
            catch (NumberFormatException e)
            {
                return;
            }
            System.out.printf("%-17s%-2c",outTinggi,':');
            double tinggiBadan = Double.parseDouble(input.nextLine());
            IMT = beratBadan / (tinggiBadan * tinggiBadan);
            if (IMT <= 18.5)
            {
                System.out.printf("%s%c%c%c%.2f%c%s","IMT",' ','=',' ',IMT,' ',"Termasuk kurus");
            }
            else if (IMT > 18.5 && IMT <= 25)
            {
                System.out.printf("%s%c%c%c%.2f%c%s","IMT",' ','=',' ',IMT,' ',"Termasuk normal");
            }
            else if (IMT > 25 && IMT <= 30)
            {
                System.out.printf("%s%c%c%c%.2f%c%s","IMT",' ','=',' ',IMT,' ',"Termasuk gemuk");
            }
            else if (IMT > 30)
            {
                System.out.printf("%s%c%c%c%.2f%c%s","IMT",' ','=',' ',IMT,' ',"Termasuk kegemukan");
            }
            System.out.print("\n\n");
        }
    }
}