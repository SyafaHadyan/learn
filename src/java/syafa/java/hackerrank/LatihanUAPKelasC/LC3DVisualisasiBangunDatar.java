package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DVisualisasiBangunDatar
{
    public static void shapeBuilderTriangle(int shapeSize)
    {
        /*
         *    *
         *   ***
         *  *****
         * *******
         */
        int spaceBefore = shapeSize - 1;
        for (int i = 0; i < shapeSize; i++)
        {
            for (int j = 0; j < spaceBefore; j++)
            {
                System.out.print(' ');
            }
            spaceBefore--;
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
            //
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