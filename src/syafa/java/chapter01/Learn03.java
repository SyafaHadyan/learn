package syafa.java.chapter01;

import java.util.*;
public class Learn03
{
    static void Game()
    {
        String Player = "Start";
        boolean CheckInput = true;
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
            }
        }
        String [] Option = {"Rock", "Paper", "Scissor"};
        Random Rand = new Random();
        String Result = Option[Rand.nextInt(Option.length)];
        if (Player == Result)
        {
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        boolean GameRepeat = false;
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to RPS!");
        System.out.println("(0) Play once" + "\n" + "(1) Play indefinitely");
        int PlayDuration = Integer.parseInt(Input.nextLine());
        Input.close();
        while (GameRepeat)
        {

            if (PlayDuration == 0)
            {
                System.out.println();
                Game();
                GameRepeat = false;
            }
            else if (PlayDuration == 1)
            {
                System.out.println();
                Game();
                GameRepeat = true;
            }
        }
    }
}
