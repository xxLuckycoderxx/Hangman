import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
/*
        String extraInfo;
        String name;
        String story;
        String guess = "school";
        String input;
        int point = 6;
        Scanner mac = new Scanner(System.in);

        System.out.println("Hello my name is Mac and we are going to play a game.Before that ,what is your name?");
        name = mac.nextLine();
        System.out.println("Well " + name + " we are going to play a game of Hangman.Try your best to guess the correct words" +
                " ,You have 6 lives.Before we start make a backstory for your Hangman");

        System.out.println("BACKSTORY");
        story = mac.nextLine();
        System.out.println("Anything else you want to write about about your character?Include it below");
        extraInfo = mac.nextLine();

        for (int net = 1; net < 7; net++) {

            if (input.equals(4)) {
                System.out.println(point - 1 + " tries left");

            }


            System.out.println("You have completed the game so do you have any suggestions on how to improve it ?\nSuggestion;");
            String suggestions = mac.nextLine();
            System.out.println("Yhank you for your input");

            System.out.println("Give me some commentary \n Commentary");
            String comments = mac.nextLine();
            System.out.println("Thank you for your input");


            System.out.println("Would you like to give up if so type (0)in the space below ");
            String exit = mac.nextLine();
            int quit = 0;
            if (exit.equals(quit)) {
                System.exit(0);

                System.out.println("Now that you have gotten used to the  game why don't you choose a gender for your hangperson\n type either male or female ");
                String gender = mac.nextLine();

                System.out.println("So how are you liking the game so far from a scale of 1-10 ");
                int rating = mac.nextInt();

                System.out.println("Thank you for your time");

                System.out.println("Thank you for your time");


            }

            static String hangedMan (){




                System.out.println("+--------------------------------- ");
                System.out.println("|                |                 ");
                System.out.println("|                |                 ");
                System.out.println("|                O                 ");
                System.out.println("|           ---- 1------           ");
                System.out.println("|                |                 ");
                System.out.println("|               _|_                ");
                System.out.println("|              |   |              ");
                System.out.println("|              |   |              ");
                System.out.println("|             _|   |_             ");
                System.out.println("|                                  ");
                System.out.println("+----------------------------------");


            }}*/
        Scanner keyboard=new Scanner(System.in);
        display();
       System.out.println("give me words");
       String input=keyboard.nextLine();

    }
  static void display(){

      System.out.println("+--------------------------------- +");
      System.out.println("|                |                 |");
      System.out.println("|                |                 |");
      System.out.println("|                O                 |");
      System.out.println("|           ---- 1------           |");
      System.out.println("|                |                 |");
      System.out.println("|               _|_                |");
      System.out.println("|              |   |               |");
      System.out.println("|              |   |               |");
      System.out.println("|             _|   |_              |");
      System.out.println("|                                  |");
      System.out.println("+----------------------------------+");

     }
}

