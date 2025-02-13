import java.util.*;

public class Draw
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan gambar yang digambar",':');
        String gambar = input.nextLine();
        System.out.printf("%-30s%-2c","Masukkan perulangan",':');
        int perulangan = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = perulangan; i > 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(gambar);
                if (j != 1)
                {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
    }
}