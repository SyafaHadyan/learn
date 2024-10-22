package syafa.java.Praktikum.Bab4;

public class N05Array1D
{
    public static void main(String[] args)
    {
        double[] bil = new double[10];
        int i;
        for (i = 2; i <= 8; i++)
        {
            bil[i] = 1 + /*(int)*/(Math.random() * 100);
        }
        for (i = 0; i < 10; i++)
        {
            System.out.println(bil[i]);
        }
    }
}