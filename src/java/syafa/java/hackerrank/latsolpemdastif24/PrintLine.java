package syafa.java.hackerrank.latsolpemdastif24;
import java.util.Scanner;

public class PrintLine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        print(input.nextLine());
        input.close();
    }
  	public static void print(String kalimat)
    {
    	System.out.print('#' + kalimat + '#');
    }
}