import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final String outBerat = "Berat badan" + ' ' + "(kg)";
        final String outTinggi = "Tinggi badan" + ' ' + "(m)";
        double IMT = 0;
        double beratBadan;
        double tinggiBadan;
        boolean ulang = true;
        try
        {
            System.out.printf("%-17s%-2c",outBerat,':');
            beratBadan = Double.parseDouble(input.nextLine());
            System.out.printf("%-17s%-2c",outTinggi,':');
            tinggiBadan = Double.parseDouble(input.nextLine());
        }
        catch (NumberFormatException e)
        {
            input.close();
            return;
        }
        input.close();
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
    }
}