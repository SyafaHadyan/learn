import java.util.*;

public class Output0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kode yang akan dijalankan:" + "\n" + 
                            "int x, y;" + "\n" + 
                            "for (x = x awal; x <= x maksimal; x++)" + "\n" + );
        System.out.printf("%-30s%-2c","Masukkan nilai x",':');
        int x = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai y",':');
        int y = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai maksimal x",':');
        int maksimalX = Integer.parseInt(input.nextLine());
        System.out.printf("%-30s%-2c","Masukkan nilai minimal y",':');
        int minimalY = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = x; i <= maksimalX; i++)
        {
            for (int j = y; j >= minimalY; j--)
            {
                System.out.printf("%d%d",x,y);
            }
        }
    }
}