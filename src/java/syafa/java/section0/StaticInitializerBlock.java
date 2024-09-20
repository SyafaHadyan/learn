package syafa.java.section0;
import java.io.*;
import java.util.*;

public class StaticInitializerBlock
{
    Scanner input = new Scanner(System.in);
    double breadth = Double.parseDouble(input.nextLine());
    double height = Double.parseDouble(input.nextLine());
    input.close();
    if (breadth >= 1 && height >= 1)
    {
        System.out.printf("%.0f",breadth * height);
    }
    else if (breadth <= 0 || height <= 0)
    {
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
}