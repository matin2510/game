package nyc.c4q;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Game2 {

    private Scanner scanner;

    private int punch;
    private int block;
    private int health = 100;
    private String name;
    boolean gameover = false;

    public void method() {
        scanner = new Scanner(System.in);

        System.out.println("Hello player! What is your name?");
        name = scanner.nextLine();
        System.out.println("Hi " + name + " Welcome to WestWorld " + "!" );

        while(health>0){
            System.out.println(" What is your punch level: ");
            punch = scanner.nextInt();
            System.out.println("What is your block level: ");
            block = scanner.nextInt();
            System.out.println("Your attack is " + punch + ". Your defense is " + block + "\n\n");

            encounter();

        }

        for(int i = 0; i < name.length()-1; i++) {

              System.out.println("Make sure to attack back!");

          }
    }
      public void encounter() {

        int hostAttack = 5;
        int hostDefense = 3;
        int hostHealth = 20;

          System.out.println(" You have encountered a goblin with " + hostAttack + " Attack and " + hostDefense + " Defence. It has " + hostHealth + " percent Health" );

          if(punch >= (hostHealth + (2 * hostDefense))) {

             System.out.println("You killed the goblin!!!!!!!");
              System.out.println("Do you want to play again? YES or NO?");
              Scanner newScanner = new Scanner(System.in);
             String answer = newScanner.nextLine();

             switch (answer){
                 case "NO":
                     System.exit(0);
                     break;
             }


         } else if (punch < (hostHealth + (2 * hostDefense ))) {
               health = health - hostAttack;

             System.out.println("The goblin has attacked " + hostAttack +  " your  health " + health + " is reduced by five ");
         }
    }
}
