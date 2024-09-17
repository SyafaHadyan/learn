package syafa.java.chapter01;

import java.util.*;
public class Learn03
{
    public static int Game()
    {
        String Player = "Start";
        boolean CheckInput = true;
        int Match = -1;
        Scanner Input = new Scanner(System.in);
        while (CheckInput)
        {
            System.out.print("Pick an option" + "\n" + "(0) Rock" + "\n" + "(1) Paper" + "\n" + "(2) Scissor" + "\n" + "(3) Quit" + "\n" + "Enter" + ':' + ' ');
            int User = Integer.parseInt(Input.nextLine());
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
            else if (User == 3)
            {
                Player = "Quit";
                CheckInput = false;
            }
            else
            {
                System.out.println("\n" + "Invalid input, please try again" + "\n");
                CheckInput = true;
            }
        }
        String [] Option = {"Rock", "Paper", "Scissor"};
        Random Rand = new Random();
        String Result = Option[Rand.nextInt(Option.length)];
        if (Player == Result)
        {
            Match = 2;
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
        else if (Player == "Quit")
        {
            Match = 3;
            Input.close();
        }
        return Match;
    }
    public static void main(String[] args)
    {
        boolean GameRepeat = true;
        boolean CheckInput = true;
        int Win = 0;
        int Lose = 0;
        int Tie = 0;
        int PlayDuration = -1;
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to RPS!");
        while (CheckInput)
        {
            System.out.print("(0) Play once" + "\n" + "(1) Play indefinitely" + "\n" + "Enter" + ':' + ' ');
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
        }
        while (GameRepeat)
        {

            if (PlayDuration == 0)
            {
                System.out.println();
                int Match = Game();
                if (Match == 0)
                {
                    System.out.print("You Lost");
                }
                else if (Match == 1)
                {
                    System.out.print("You won");
                }
                else if (Match == 2)
                {
                    System.out.print("Tie");
                }
                GameRepeat = false;
            }
            else if (PlayDuration == 1)
            {
                System.out.println();
                int Match = Game();
                if (Match == 0)
                {
                    Lose = Lose + 1;
                    System.out.println("You Lost");
                    System.out.println("Win/Lose/Tie" + ':' + ' ' + Win + '/' + Lose + '/' + Tie);
                    GameRepeat = true;
                }
                else if (Match == 1)
                {
                    Win = Win + 1;
                    System.out.println("You won");
                    System.out.println("Win/Lose/Tie" + ':' + ' ' + Win + '/' + Lose + '/' + Tie);
                    GameRepeat = true;
                }
                else if (Match == 2)
                {
                    Tie = Tie + 1;
                    System.out.println("Tie");
                    System.out.println("Win/Lose/Tie" + ':' + ' ' + Win + '/' + Lose + '/' + Tie);
                    GameRepeat = true;
                }
                else if (Match == 3)
                {
                    System.out.println("Quit");
                    System.out.print("\n" + "Session result" + "\n" + "Win" + ':' + ' ' + Win + "\n" + "Lose" + ':' + ' ' + Lose + "\n" + "Tie" + ':' + ' ' + Tie);
                    GameRepeat = false;
                }
            }
        }
        Input.close();
    }
}