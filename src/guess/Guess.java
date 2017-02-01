/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //int answer = 5;
    Random ran = new Random();
    int answer = ran.nextInt(10) + 1;
   Scanner sc = new Scanner(System.in);
   System.out.print("Guess a number Game ");
   System.out.print("Guess a number between 1 and 100 ");
   
   while (true){
         System.out.print("Enter a number");
         int Guess = sc.nextInt();
         if(Guess == answer){
             break;
         } else if (Guess >= answer){
             System.out.println("You guess was too low, try again");
         } else {
             System.out.print("Your guess was too high, try again");
         }
         System.out.print("correct");
     }
    }
    
}
