import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int randnum = (int) (Math.random() * 10 + 1);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Random number generated between 1 and 10. Guess what it is. You have one guess, try your luck!!. ");
        int guess = keyboard.nextInt();
        if (guess == randnum)
        {
            System.out.println("Correct guess! The number was " + randnum + "!");
        }
        else if (guess < randnum)
        {
            System.out.println("Too low. The number was " + randnum + ".");
        }
        else if (guess > randnum)
        {
            System.out.println("Too high. The number was " + randnum + ".");
        }
    }
}