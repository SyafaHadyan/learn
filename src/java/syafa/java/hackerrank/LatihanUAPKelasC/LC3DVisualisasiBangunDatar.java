package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DVisualisasiBangunDatar
{
    static final char SHAPE = '*';
    public static void shapeBuilderTriangle(int shapeSize)
    {
        /*
         *    *
         *   ***
         *  *****
         * *******
         */
        int spaceBefore = shapeSize - 1;
        int level = 1;
        for (int i = 0; i < shapeSize; i++)
        {
            for (int j = 0; j < spaceBefore; j++)
            {
                System.out.print(' ');
            }
            spaceBefore--;
            for (int j = 0; j < level; j++)
            {
                System.out.print(SHAPE);
            }
            level += 2;
            System.out.print("\n");
        }
    }
    public static void shapeBuilderSquare(int shapeSize)
    {
        //
    }
    public static void shapeBiulderParallelogram(int shapeSize)
    {
        //
    }
    public static void shapeBuilder(int shapeSize,String shapeRequest)
    {
        System.err.println(shapeSize);
        System.err.println(shapeRequest);
        if (shapeRequest.equalsIgnoreCase("Segitiga"))
        {
            shapeBuilderTriangle(shapeSize);
            return;
        }
        if (shapeRequest.equalsIgnoreCase("Persegi"))
        {
            //
        }
        if (shapeRequest.equalsIgnoreCase("JajarGenjang"))
        {
            //
        }
        else
        {
            System.out.println("Tidak ada bentuk dalam daftar");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        shapeBuilder(Integer.parseInt(input.nextLine()),input.nextLine());
        input.close();
    }
}