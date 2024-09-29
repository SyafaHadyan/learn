import java.util.*;

public class Output0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        int maksimalX = Integer.parseInt(input.nextLine());
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