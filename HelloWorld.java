import java.util.Scanner;

public class HelloWorld {
    static Scanner gn = new Scanner(System.in);

    static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("An error has occurred.");
        }
    }

    public static void main(String args[]) {
        int lock = 1;
        System.out.println("Hello user");
        pause(2000);
        ;
        System.out.println("Welcome to this program.");
        pause(2000);
        System.out.println(
                "Just so you know, I made this program when I was bored, actually no point in it, so if you want you can quit now, by entering \'~'.");
        System.out.println("If you want to continue, press any other key.(Pressing enter doesn't count.)");
        char qui = gn.next().charAt(0);
        if (qui == '~') {
            pause(2000);
            System.out.println("\u001B[3msigh....\u001B[0m");
            pause(2000);
            System.out.println("What can I say?... ultimate loser.");
            pause(2000);
            System.out.println("So then, bye... not really.");
            System.exit(0);
        }
        gn.nextLine();
        pause(2000);
        System.out.println("Well congrats on not quitting on the first instance itself. ");
        pause(2000);
        System.out.println("I can assure you that there will be plenty more opportunities in the future.");
        pause(2000);
        System.out.println("So anyways, let's get to know each other a bit, what's your name?");
        String name = gn.nextLine();
        pause(2500);
        if ((int) (Math.random() * 2) == 1) {
            char ch = name.charAt((name.length() - 1));
            System.out.println("Nice name, esp that '" + ch + "' at the end.");
        } else {
            char ch = name.charAt(0);
            System.out.println("Nice name, esp that '" + ch + "' at the beginning.");
        }
        pause(2000);
        System.out.println("And in case you were wondering, my name is SirGN.");
        pause(1000);
        System.out.println("So... what's your age?");
        int age = gn.nextInt();
        pause(2000);
        if (age < 18) {
            System.out.println("\u001B[3mMmmmmm.....\u001B[0m");
            pause(1000);
            System.out.println("So we have a small kid with us... whatever.");
        } else if (age >= 18 && age <= 100) {
            System.out.println("Hey adult.");
            pause(1000);
            System.out.println("\u001B[3mI really hope you are not lying....\u001B[0m");
        } else if (age >= 0 || age > 100) {
            System.out.println("Who are you trying to kid?");
            pause(2000);
            System.out.println("\u001B[3mProbably a child.... doesn't matter, get out of here\u001B[0m");
            pause(2500);
            System.out.println("Nah.. I will do it myself.");
            System.exit(0);
        }
        gn.nextLine();
        pause(2000);
        System.out.println("So then, what else?");
        pause(2000);
        System.out.println("So let me ask you... why did you run this program? Like why?");
        gn.nextLine();
        for (int i = 0; i < 3; i++) {
            pause(3500);
            if (i == 0)
                System.out.println("But why?");
            else if (i == 1)
                System.out.println("Oh really? But still why?");
            else
                System.out.println("I still can't understand you...");
            gn.nextLine();
        }
        pause(2000);
        System.out.println("\u001B[3msigh....\u001B[0m");
        pause(2000);
        System.out.println("This isn't fun.");
        pause(2000);
        System.out.println("What about this?");
        pause(1000);
        System.out.println("What was the exact 14th word I displayed?");
        String w5 = gn.next();
        pause(2000);
        if (w5.equalsIgnoreCase("program")) {
            System.out.println("Correct, although it was too easy to even get wrong.");
        } else {
            System.out.println("\u001B[3msigh....\u001B[0m");
            pause(2000);
            System.out.println(
                    "Wrong.\nI am simply tired with you, so I am ending this program. Talk to you late when you can actually think (maybe).");
            pause(5000);
            System.exit(0);

        }
        pause(1000);
        System.out.println("So.. what do you want to do now?");
        pause(2000);
        System.out.println(
                "Try answering this question... what is the sum of the expression: 1/2 + 1/4 + 1/8 + 1/16 ...up to infinity.");
        pause(1000);
        System.out.println("Take your time.");
        int ansinf = gn.nextInt();
        pause(2000);
        if (ansinf == lock) {
            System.out.println("Correct... how did you do that? I thought you would fail in the attempt.");
        } else {
            System.out.println("\u001B[3msigh....\u001B[0m");
            pause(2000);
            System.out.println(
                    "Wrong.\nI guess that was too hard for you, here:\n2+3 = \n Try that problem.");
            pause(2000);
            System.out.println(
                    "And in case you didn't understand, that was irony. So you don't really need to answer that question. I am also doing you a favor by ending this program. Thank me later :)");
            pause(5000);
            System.exit(0);

        }
    }
}