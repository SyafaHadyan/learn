import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        String unitBerat = "(kg)";
        String unitTinggi = "(m)";
        Scanner input = new Scanner(System.in);
        System.out.printf("%-17s%-2c","Berat badan",' ',unitBerat,':');
        double beratBadan = Double.parseDouble(input.nextLine());
        double tinggiBadan = Double.parseDouble(input.nextLine());
    }
}