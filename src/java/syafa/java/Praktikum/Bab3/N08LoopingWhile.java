package syafa.java.Praktikum.Bab3;

public class N08LoopingWhile
{
    public static void main(String[] args)
    {
        int nilai = 2;
        
        while(nilai<=10)
        {
            System.out.print(nilai);
            if (nilai <= 10)
            {
                System.out.print("\n");
            }
            nilai += 2;
        }
    }
}