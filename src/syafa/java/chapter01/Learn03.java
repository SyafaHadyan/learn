package syafa.java.chapter01;

import java.util.*;
public class Learn03
{
    public static int Game()
    {
        String Player = "Start";
        boolean CheckInput = true;
        int Match = 2;
        Scanner Input = new Scanner(System.in);
        System.out.println("Please choose an option" + "\n" + "(0) Rock" + "\n" + "(1) Paper" + "\n" + "(2) Scissor");
        int User = Integer.parseInt(Input.nextLine());
        Input.close();
        while (CheckInput)
        {
            if (User == 0)
            {
                Player = "Rock";
                CheckInput = false;
            }
            else if (User == 1)
            {
                Player = "Paper";
                CheckInput = false;
            }
            else if (User == 2)
            {
                Player = "Scissor";
                CheckInput = false;
            }
            else
            {
                System.out.println("Invalid input, please try again");
                CheckInput = true;
            }
        }
        String [] Option = {"Rock", "Paper", "Scissor"};
        Random Rand = new Random();
        String Result = Option[Rand.nextInt(Option.length)];
        if (Player == Result)
        {
            System.out.println("Tie");
        }
        else if (Player == "Rock")
        {
            if (Result == "Paper")
            {
                Match = 0;
            }
            else if (Result == "Scissor")
            {
                Match = 1;
            }
        }
        else if (Player == "Paper")
        {
            if (Result == "Rock")
            {
                Match = 1;
            }
            else if (Result == "Scissor")
            {
                Match = 0;
            }
        }
        else if (Player == "Scissor")
        {
            if (Result == "Rock")
            {
                Match = 0;
            }
            else if (Result == "Paper")
            {
                Match = 1;
            }
        }
        return Match;
    }
    public static void main(String[] args)
    {
        boolean GameRepeat = false;
        boolean CheckInput = true;
        int PlayDuration = 2;
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to RPS!");
        while (CheckInput)
        {
            System.out.println("(0) Play once" + "\n" + "(1) Play indefinitely");
            PlayDuration = Integer.parseInt(Input.nextLine());
            if (PlayDuration == 0)
            {
                CheckInput = false;
            }
            else if (PlayDuration == 1)
            {
                CheckInput = false;
            }
            else
            {
                System.out.println("Invalid input, please try again");
                CheckInput = true;
            }
            Input.close();
        }
        while (GameRepeat)
        {

            if (PlayDuration == 0)
            {
                System.out.println();
                int Match = Game();
                if (Match == 0)
                {
                    System.out.println("You Lost");
                }
                else if (Match == 1)
                {
                    System.out.println("You won");
                }
                GameRepeat = false;
            }
            else if (PlayDuration == 1)
            {
                System.out.println();
                int Match = Game();
                if (Match == 0)
                {
                    System.out.println("You Lost");
                }
                else if (Match == 1)
                {
                    System.out.println("You won");
                }
                GameRepeat = true;
            }
        }
    }
}