import java.util.Scanner;
import java.util.Random;

public class Guess_the_number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int play_game;

    Game obj = new Game();

    boolean check = false;

    System.out.print("Enter 1 to play a game : ");
    play_game = sc.nextInt();

    if (play_game == 1) {

      while (play_game == 1) {
        obj.taking_user_input();
        check = obj.is_correct();

        if (check == true) {
          break;
        }
      }
    }

    else {
      System.out.println("You chose not to play the game!");
    }

    sc.close();
  }
}

class Game {
  Random random = new Random();
  int random_generated_input;
  int user_input;
  int no_of_guesses = 0;
  int hint;
  public boolean bool;

  Scanner scan = new Scanner(System.in);

  public Game() {
    random_generated_input = random.nextInt(0, 100);
  }

  public void taking_user_input() {
    System.out.print("Enter your guess : ");
    user_input = scan.nextInt();
  }

  public boolean is_correct() {
    if (random_generated_input == user_input) {
      System.out.println("You Guessed it Right!");
      System.out.println("You guessed it in a " + get_no_of_guesses() + " trial");
      return true;
    } else {
      System.out.println("Try again!");

      set_no_guesses();

      System.out.print("Enter 2 to take a hint : ");
      hint = scan.nextInt();

      if (hint == 2) {
        take_hint();
      } else {
        System.out.println("Good Luck! Guessing");
      }

      return false;
    }

  }

  public void take_hint() {
    if (random_generated_input > user_input) {
      System.out.println("Enter a bigger number!");
    } else {
      System.out.println("Enter a smaller number!");
    }
  }

  public int get_no_of_guesses() {
    return no_of_guesses;
  }

  public int set_no_guesses() {
    return ++no_of_guesses;
  }

}
