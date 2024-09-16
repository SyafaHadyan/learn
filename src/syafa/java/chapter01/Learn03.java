package syafa.java.chapter01;

import java.util.*;
import java.util.concurrent.*;
public class Learn03
{
    static void Choose()
    {
        String [] Option = {"Rock", "Paper", "Scissor"};
        Random rand = new Random();
        String Choose = Option[rand.nextInt(Option.length)];
    }
    static void Logic()
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please choose an option" + "\n" + "(0) Rock" + "\n" + "(1) Paper" + "\n" + "(2) Scissor");
        int User = Integer.parseInt(Input.nextLine());
        Input.close();
    }
    public static void main(String[] args)
    {
        boolean Repeat = true;
        System.out.println("Welcome to RPS!");
        System.out.println("(0) Play once" + "\n" + "(1) Play indefinitely");
        int PlayDuration = Integer.parseInt(Input.nextLine());
        while (Repeat)
        {
            if (PlayDuration == 0)
            {
                Choose();
            }
        }
    }
}
