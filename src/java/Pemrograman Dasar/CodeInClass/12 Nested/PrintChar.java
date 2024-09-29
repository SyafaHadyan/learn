import java.util.*;

public class PrintChar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String gambar = input.nextLine();
        int perulangan = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = perulangan; i >= 0; i--)
        {
            for (int j = i; j >=0; j--)
            {
                System.out.print(gambar);
            }
            System.out.print("\n");
        }
    }
}