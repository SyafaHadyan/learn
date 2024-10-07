package syafa.java.Praktikum.Bab3;

public class N10LoopingDoWhile
{
    public static void main(String[] args)
    {
        int nilai = 1;
        do
        {
            System.out.print(nilai);
            if (nilai < 10)
            {
                System.out.print("\n");
            }
            nilai++;
        }
        while(nilai <= 10);
    }
}