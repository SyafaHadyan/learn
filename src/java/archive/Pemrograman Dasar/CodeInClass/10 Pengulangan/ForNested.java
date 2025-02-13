public class ForNested
{
    public static void main(String[] args)
    {
        int x, y;
        for (x = 1; x <= 5; x++)
        {
            for (y = 5; y >= 1; y--)
            {
                System.out.printf("%d%d",x,y);
            }
        }
    }
}