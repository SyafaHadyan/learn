package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3DVisualisasiBangunDatar
{
    public static void shapeBuilder(int shapeSize,String shapeRequest)
    {
        System.out.println(shapeSize);
        System.out.println(shapeRequest);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        shapeBuilder(Integer.parseInt(input.nextLine()),input.nextLine().toLowerCase());
        input.close();
    }
}