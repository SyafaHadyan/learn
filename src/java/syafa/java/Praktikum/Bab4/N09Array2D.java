package syafa.java.Praktikum.Bab4;
import java.util.*;

public class N09Array2D
{
    @SuppressWarnings("unused")
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        in.close(); 
        String nama[] = new String[10];
        int[][] coba = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        float [][] bank = new float [2][3];
        System.out.println(" i  j coba[i][j]");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%2d %2d %3d\n",i,j,coba[i][j]);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                bank[i][j] = (float)(i * 0.5 + j * 0.25);
            }
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j < 3 ; j++)
            { 
                System.out.print(bank[i][j] + " ");
            }
        }
    }
}