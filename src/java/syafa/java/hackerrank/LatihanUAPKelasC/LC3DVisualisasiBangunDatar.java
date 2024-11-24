package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DVisualisasiBangunDatar
{
    public static void shapeBuilderTriangle(int shapeSize)
    {
        //
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