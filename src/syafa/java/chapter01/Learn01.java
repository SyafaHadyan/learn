package syafa.java.chapter01;

import java.util.*;

public class Learn01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int n = input.nextInt();
        System.out.println("Dengklek tidur pada jam " + h + " selama " + n + " jam, dan akan bangun pada jam 5");
        input.close();
    }
}