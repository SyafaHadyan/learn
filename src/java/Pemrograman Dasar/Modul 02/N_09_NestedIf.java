import java.util.*;

public class N_09_NestedIf
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        in.close();
        if (nilai * 2 < 50)
        {
            nilai += 10;
        }
        if (nilai <= 20)
        {
            System.out.println("Filkom");
            if (nilai % 2 == 1)
            {
                System.out.println("UB");
            }
            else
            {
                System.out.println("Brawijaya");
            }
        }
        else
        {
            System.out.println("PTIIK");
            if (nilai % 2 == 1)
            {
                System.out.println("UB");
            }
            else
            {
                System.out.println("Brawijaya");
            }
        }
        /*
         * Input pertama: 5
         * Nilai jika dikali 2 kurang dari 50, maka nilai = nilai + 10 = 15
         * Nilai kurang dari sama dengan 20, kemudian print "Filkom", dan modulo pembagian dari nilai 15 bersisa 1, maka print "UB"
         * 
         * Input kedua: 20
         * Nilai jika dikali 2 kurang dari 50, maka nilai = nilai + 10 = 30
         * Nilai tidak kurang dari sama dengan 20, kemudian print "PTIIK" dan modulo pembagian dari nilai 30 tidak bersisa 1, maka print "Brawijaya"
         * 
         * Input ketiga: 30
         * Nilai jika dikali 2 tidak kurang dari 50
         * Nilai tidak kurang dari sama dengan 20, kemudian print "PTIIK" dan modulo pembagian dari nilai 50 tidak bersisa 1, maka print "Brawijaya"
         */
    }
}