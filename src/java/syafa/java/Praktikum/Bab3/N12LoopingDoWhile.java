package syafa.java.Praktikum.Bab3;

public class N12LoopingDoWhile
{
    public static void main(String[] args)
    {
        int nilai = 11;
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