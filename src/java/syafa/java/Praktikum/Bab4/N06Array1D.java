package syafa.java.Praktikum.Bab4;

public class N06Array1D
{
    public static void main(String[] args)
    {
        int[] bil = new int[10];
        int i;
        for (i = 0; i <= 9; i++)
        {
            bil[i] = 1 + (int)(Math.random() * 100);
        }
        for (i = 0;i <= 10; i++)
        {
            try
            {
                System.out.println(bil[i]);
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.print("IndexOutOfBounds");
            }
        }
    }
}