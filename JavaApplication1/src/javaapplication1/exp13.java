
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp13 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int add;
      int max; 
            System.out.println("عدد را وارد کنید");
            add=input.nextInt();
          max=add;
          
          for (int i =2; i <=5; i++) {
            System.out.println("عدد را وارد کنید");
            add=input.nextInt();
              if (add>max) {
                  max=add;
              }    
        }
          System.err.println("max"+max);
        }
    }

