import java.util.*;

public class For
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlahPengulangan = Integer.parseInt(input.nextLine());
        input.close();
        for (int i = 1; i <= jumlahPengulangan; i++)
        {
            System.out.println(i);
        }
    }
}