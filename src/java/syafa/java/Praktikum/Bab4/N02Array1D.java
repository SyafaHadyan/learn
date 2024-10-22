package syafa.java.Praktikum.Bab4;

public class N02Array1D
{
    public static void main(String[] args)
    {
        int[] bil = new int[10];
        int i;
        for (i = 0; i <= 9; i++) // kesalahan pada `i+`
        {
            bil[i] = 1 + (int)(Math.random()*100);
        }
        for (i = 0; i < 10; i++)
        {
            System.out.println(bil[i]);
        }
    }
}