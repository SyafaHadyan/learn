import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        String unitBerat = "(kg)";
        String unitTinggi = "(m)";
        String outBerat = "Berat badan" + ' ' + unitBerat;
        String outTinggi = "Tinggi badan" + ' ' + unitTinggi;
        boolean ulang = true;
        Scanner input = new Scanner(System.in);
        while (ulang)
        {
            System.out.printf("%-17s%-2c",outBerat,':');
            double beratBadan = Double.parseDouble(input.nextLine());
            System.out.printf("%-17s%-2c",outTinggi,':');
            double tinggiBadan = Double.parseDouble(input.nextLine());
        }
    }
}