import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        String Hello = Input.nextLine();
        int WhiteSpace = Integer.parseInt(Input.nextLine());

        System.out.printf("%s%s%s%s%s","##",WhiteSpace,Hello,WhiteSpace,"##");
    }
}