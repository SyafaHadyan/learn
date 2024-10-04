package syafa.java.hackerrank.DataStructures;
import java.util.*;

public class JavaGenerics
{
    public static void main(String[] args)
    {
        ArrayList<String> outputString = new ArrayList<String>();
        ArrayList<Integer> outputInteger = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++)
        {
            outputInteger.add(i + 1);
        }
        outputString.add("Hello");
        outputString.add("World");
        for (int i = 0; i < outputString.size() + outputInteger.size(); i++)
        {
            
        }
    }
}