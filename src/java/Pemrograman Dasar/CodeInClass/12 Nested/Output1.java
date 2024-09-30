import java.util.*;

public class Output1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        int z = Integer.parseInt(input.nextLine());
        int maksimalX = Integer.parseInt(input.nextLine());
        int maksimalY = Integer.parseInt(input.nextLine());
        int maksimalZ = Integer.parseInt(input.nextLine());
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
                    System.out.print("Selamat" + "\n");
                }
                System.out.print("Datang" + "\n");
            }
        }
    }
}