package syafa.java.Praktikum.Bab4;
import java.util.*;
//import java.util.stream.*;

public class Praktikum0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int option = 0;
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
                continue;
            }
            System.out.printf("\n%-20s%-2c","Masukkan nilai",':');
            option = Integer.parseInt(input.nextLine());
        }
        if (option >= 1 && option <=6)
        {
            //
        }
        else if (option == 7)
        {
            System.exit(0);
        }
        input.close();
    }
}