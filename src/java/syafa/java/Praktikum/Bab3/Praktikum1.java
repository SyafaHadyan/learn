package syafa.java.Praktikum.Bab3;
import java.util.*;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char letter = input.nextLine().charAt(0);
        input.close();
        ArrayList<String> A = new ArrayList<String>(Arrays.asList( "       A",
                                                                        "      A A",
                                                                        "     A   A",
                                                                        "    A     A",
                                                                        "   A A A A A",
                                                                        "  A         A",
                                                                        " A           A",
                                                                        "A             A"));
        for (int i = 0; i < A.size(); i++)
        {
            System.out.print(A.get(i));
            if (i < A.size())
            {
                System.out.print("\n");
            }
        }
    }
}