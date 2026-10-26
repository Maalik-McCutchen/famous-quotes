package pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    private static Quotes[] quotes = new Quotes[10];

    public static void main(String[] args) {

    quotes[0] = new Quotes(1, "Always do whats right");
    quotes[1] = new Quotes(2, "If I cannot do great things, I can do small things in a great way.");
    quotes[2] = new Quotes(3, "Be the change that you wish to see in the world.");
    quotes[3] = new Quotes(4, "When you help someone you help everyone");
    quotes[4] = new Quotes(5, "If I don't do it who will?");
    quotes[5] = new Quotes(6, "You get what you give.");
    quotes[6] = new Quotes(7, "In the long run, you make your own luck — good, bad, or indifferent.");
    quotes[7] = new Quotes(8, "If my mind can conceive it, if my heart can believe it, then I can achieve it.");
    quotes[8] = new Quotes(9, "Nothing is impossible. The word itself says 'I'm possible!");
    quotes[9] = new Quotes(10, "Never allow a person to tell you no who doesn’t have the power to say yes.");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter 1-10 for a Famous quote: ");
        int enterANumber = myScanner.nextInt();

        System.out.println("This famous quote is: " + quotes);

    }
}
