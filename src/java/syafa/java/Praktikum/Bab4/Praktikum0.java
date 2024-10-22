package syafa.java.Praktikum.Bab4;
import java.util.*;
import java.util.stream.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] menu =
        {
            "Input Data",
            "Lihat Data",
            "Average",
            "Sum",
            "Max",
            "Min",
            "Keluar"
        };
        for (int i = 0; i < menu.length; i++)
        {
            System.out.printf("%d%-2c%s",(i + 1),'.',menu[i]);
            if (menu.length - i != 1)
            {
                System.out.print("\n");
            }
        }
        input.close();
    }
}