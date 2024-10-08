package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class Array2DTicTacToe
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] first = input.nextLine().split(" ");
        String[] second = input.nextLine().split(" ");
        String[] third = input.nextLine().split(" ");
        input.close();

        // First condition X
        if (first[0].equalsIgnoreCase("X"))
        {
            if (first[1].equalsIgnoreCase("X"))
            {
                if (first[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[0].equalsIgnoreCase("X"))
            {
                if (third[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("X"))
            {
                if (third[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
        }

        // First condition O
        else if (first[0].equalsIgnoreCase("O"))
        {
            if (first[1].equalsIgnoreCase("O"))
            {
                if (first[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[0].equalsIgnoreCase("O"))
            {
                if (third[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("O"))
            {
                if (third[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
        }

        // Second condition X
        else if (first[1].equalsIgnoreCase("X"))
        {
            if (first[0].equalsIgnoreCase("X"))
            {
                if (first[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
        }

        // Second condition O
        if (first[1].equalsIgnoreCase("O"))
        {
            if (first[0].equalsIgnoreCase("O"))
            {
                if (first[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
        }

        // Third condition X
        else if (first[2].equalsIgnoreCase("X"))
        {
            if (first[1].equalsIgnoreCase("X"))
            {
                if (first[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[2].equalsIgnoreCase("X"))
            {
                if (third[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("X"))
            {
                if (third[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
        }

        // Third condition O
        else if (first[2].equalsIgnoreCase("O"))
        {
            if (first[1].equalsIgnoreCase("O"))
            {
                if (first[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[2].equalsIgnoreCase("O"))
            {
                if (third[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("O"))
            {
                if (third[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
        }
        
        // Fourth condition X
        else if (second[0].equalsIgnoreCase("X") && second[1].equalsIgnoreCase("X") && second[2].equalsIgnoreCase("X"))
        {
            System.out.print("X Menang");
            return;
        }
        

        // Fourth condition O
        else if (second[0].equalsIgnoreCase("O") && second[1].equalsIgnoreCase("O") && second[2].equalsIgnoreCase("O"))
        {
            System.out.print("O Menang");
            return;
        }

        // Fifth condition X
        else if (third[0].equalsIgnoreCase("X") && third[1].equalsIgnoreCase("X") && third[2].equalsIgnoreCase("X"))
        {
            System.out.print("X Menang");
            return;
        }

        // Fifth condition O
        else if (third[0].equalsIgnoreCase("O") && third[1].equalsIgnoreCase("O") && third[2].equalsIgnoreCase("O"))
        {
            System.out.print("O Menang");
            return;
        }

        // Sixth condition X
        if (third[0].equalsIgnoreCase("X"))
        {
            if (second[0].equalsIgnoreCase("X"))
            {
                if (first[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (third[1].equalsIgnoreCase("X"))
            {
                if (third[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("X"))
            {
                if (first[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
        }

        // Sixth condition O
        if (third[0].equalsIgnoreCase("O"))
        {
            if (second[0].equalsIgnoreCase("O"))
            {
                if (first[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (third[1].equalsIgnoreCase("O"))
            {
                if (third[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("O"))
            {
                if (first[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
        }

        // Seventh condition X
        else if (third[1].equalsIgnoreCase("X") && third[0].equalsIgnoreCase("X") && third[2].equalsIgnoreCase("X"))
        {
            System.out.print("X Menang");
            return;
        }

        // Seventh condition O
        else if (third[1].equalsIgnoreCase("O") && third[0].equalsIgnoreCase("O") && third[2].equalsIgnoreCase("O"))
        {
            System.out.print("O Menang");
            return;
        }

        // Eight condition X
        if (third[2].equalsIgnoreCase("X"))
        {
            if (second[2].equalsIgnoreCase("X"))
            {
                if (first[2].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (third[1].equalsIgnoreCase("X"))
            {
                if (third[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("X"))
            {
                if (first[0].equalsIgnoreCase("X"))
                {
                    System.out.print("X Menang");
                    return;
                }
            }
        }

        // Eight condition O
        if (third[2].equalsIgnoreCase("O"))
        {
            if (second[2].equalsIgnoreCase("O"))
            {
                if (first[2].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (third[1].equalsIgnoreCase("O"))
            {
                if (third[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
            if (second[1].equalsIgnoreCase("O"))
            {
                if (first[0].equalsIgnoreCase("O"))
                {
                    System.out.print("O Menang");
                    return;
                }
            }
        }
        System.out.print("Draw");
    }
}