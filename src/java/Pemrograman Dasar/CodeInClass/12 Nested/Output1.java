import java.util.*;

public class Output1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode yang akan dijalankan" + "\n\n" + 
                            "int x, y, z;" + "\n" + 
                            "for (x = x awal; x < x maksimal; x++) {" + "\n" + 
                            "\t" + "for (y = y awal; y < y maksimal; y++) {" + "\n" + 
                            "\t\t" + "for (z = z awal; z < z maksimal; z++) {" + "\n" + 
                            "\t\t\t" + "if (z == break) break;" + "\n" + 
                            "\t\t" + "}" + "\n" + 
                            "\t\t" + "System.out.print(\"Selamat\" + \"\\n\")" + "\n" + 
                            "\t" + "}" + "\n" + 
                            "\t" + "System.out.print(\"Datang\" + \"\\n\")" + "\n" + 
                            "}" + "\n" + 
                            "System.out.print(\"Datang\" + \"\\n\")" + "\n\n");
        System.out.printf("%-30s%-2c","Masukkan nilai x",':');
        int x = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai y",':');
        int y = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai z",':');
        int z = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai maksimal x",':');
        int maksimalX = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai maksimal y",':');
        int maksimalY = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai maksimal z",':');
        int maksimalZ = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Break",':');
        int keluar = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = x; i < maksimalX; i++)
        {
            for (int j = y; j < maksimalY; j++)
            {
                for (int k = z; k < maksimalZ; k++)
                {
                    if (z == keluar)
                    {
                        break;
                    }
                }
                System.out.print("Selamat" + "\n");
            }
            System.out.print("Datang" + "\n");
        }
        System.out.print("di TIF-FILKOMUB" + "\n");
    }
}