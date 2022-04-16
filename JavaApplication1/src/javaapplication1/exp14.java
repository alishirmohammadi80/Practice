
package javaapplication1;


import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp14 {
    public static void main(String[] args) {
        
 
     Scanner input = new Scanner(System.in);
      int[] add=new int[5];
      int max; 
      int jaighah = 0;
        for (int i = 0; i <5; i++) {
            System.out.println("عدد را وارد کنید");
            add[i]=input.nextInt();
            
        }
        max=add[0];
        for (int i =1; i < 5; i++) {
            if (add[i]>max) {
                max=add[i];
                 jaighah=i+1;
            }
         
        }
      
        System.out.println(max+"-"+jaighah);
        }
}
