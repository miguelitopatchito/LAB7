/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author mpatc
 */
public class LAB7 {
    public double a, b, c;
    
    public static void main(String[] args) {
        
       Scanner keyboard = new Scanner(System.in);  
       System.out.println("Enter value for A: ");
       double a = keyboard.nextDouble();
       System.out.println("Enter value for B: ");
       double b = keyboard.nextDouble();
       System.out.println("Enter value for C: ");
       double c = keyboard.nextDouble();
       
      try {
          calculate();
          
              firstXintercept = true;
         
          
          
          catch (NoXIntercept){
                  System.out.print(message);
                  }
      }
      
      catch (NoXIntercepts ex)
      {
          System.out.print("caught");
          System.out.print(ex.getMessage());
          
      }
          
      System.out.print(secondXIntercept);
       
    }

    public static void calculate (double a, double b, double c)throws NoXIntercepts {
        QuadraticSolver calc = new QuadraticSolver();
    }
    
}
