import java.util.*;

public class Output0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kode yang akan dijalankan:" + "\n" + 
                            "int x, y;" + "\n" + 
                            "for (x = x awal; x <= x maksimal; x++)" + "\n" + 
                            "\t" + "for (y = y awal; y >= y minimal; y--)" + "\n" + 
                            "\t\t" + "System.out.printf(\"%d%d\",x,y)");
        System.out.printf("%-30s%-2c","Masukkan nilai x",':');
        int x = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai y",':');
        int y = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai maksimal x",':');
        int maksimalX = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai minimal y",':');
        int minimalY = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Tebak output yang akan keluar",':');
        int tebak = Integer.parseInt(input.nextLine());
        input.close();
        System.out.printf("%s%2c\n","Nilai yang keluar",':');
        for (int i = x; i <= maksimalX; i++)
        {
            for (int j = y; j >= minimalY; j--)
            {
                System.out.printf("%d%d",x,y);
            }
        }
        System.out.print("Anda menebak" + ' ' + "");
    }
}