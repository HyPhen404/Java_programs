import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor{
  public static void main(String[] arguements){
   Scanner scan = new Scanner(System.in);
   Random random = new Random();

   String bot_play = "";
   int bot_in = random.nextInt(3);

   if(bot_in == 0){
     bot_play = "rock";
   }
   else if(bot_in == 1){
     bot_play = "paper";
   }
   else if(bot_in == 2){
     bot_play = "scissor";
   }

   System.out.println("bot has played its move!");
   System.out.println("Its your turn <3");

   System.out.print("rock ,paper or scissor > ");
   String input = scan.nextLine();

   if(input.equals(bot_play)){
     System.out.println("Its a Draw");
   }
   else if(input.equals("rock")  && bot_play.equals("paper")){
     System.out.printf("BOT won.\n  bot = %s \n you = %s ", bot_play , input );
   }
   else if(input.equals("rock") && bot_play.equals("scissor")){
    System.out.printf("YOU won.\n  bot = %s \n you = %s ", bot_play , input );

   }
   else if(input.equals("paper") && bot_play.equals("rock")){
  System.out.printf("YOU won.\n  bot = %s \n you = %s ", bot_play , input );

   }

   else if(input.equals("paper") && bot_play.equals("scissor")){
       System.out.printf("BOT won.\n  bot = %s \n you = %s ", bot_play , input );

   }
   else if(input.equals("scissor") && bot_play.equals("rock")){
     System.out.printf("BOT won.\n  bot = %s \n you = %s ", bot_play , input );

   }

   else if(input.equals("scissor") && bot_play.equals("paper")){
        System.out.printf("YOU won.\n  bot = %s \n you = %s ", bot_play , input );

   }


    scan.close();


  }



}
