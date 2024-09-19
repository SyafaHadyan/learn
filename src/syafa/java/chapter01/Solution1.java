import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String user_input = input.nextLine();
        int whitespace = Integer.parseInt(input.nextLine());
        input.close();
        String space = String.format("%" + whitespace + "s", "");
        System.out.printf("%s%s%s%s%s","##",space,user_input,space,"##");
    }
}