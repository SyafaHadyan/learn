package syafa.java.Praktikum.Bab3;
import java.util.Scanner;

public class N03LoopingFor
{
    public static void main(String[] args)
    {
        /*
         * for (inisialisasi; kondisi; ekspresi_iterasi) {
         * statement1;
         * statement2;
         * ...
         * }
         */

        // instansiasi scanner
        Scanner input = new Scanner(System.in);

        // input dari user
        int n = input.nextInt(); 
        input.close();
        
        // inisialisasi dengan nilai awal i = 0
      	// looping selama nilai i <= n
        for (int i = 0; i <= n; /*i++*/)
        {
            // setiap iterasi, n bertambah 1
            System.out.print(i);
            if (i <= n)
            {
                System.out.print("\n");
            }
        }
    }
}