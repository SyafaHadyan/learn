package syafa.java.chapter01;

import java.util.*;
import java.util.concurrent.*;

public class Learn03
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to RPS!");
        System.out.println("(0) Play once" + "\n" + "(1) Play indefinitely");
        System.out.println("Please choose an option" + "\n" + "(0) Rock" + "\n" + "(1) Paper" + "\n" + "(2) Scissor");
        int User = Integer.parseInt(Input.nextLine());
        String [] Option = {"Rock", "Paper", "Scissor"};
        Random rand = new Random();
        String Choose = Option[rand.nextInt(Option.length)];
        System.out.println(Choose);
    }
}
