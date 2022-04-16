
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] makan=new int[10];
        int tadad=0;
        int[] add=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("عدد را وارو کنید");
            add[i]=input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (add[i]==49) {
                tadad++;
               makan[i]=49;
            }
          
        }
         System.out.println("تعداد تکرار"+tadad);
         for (int i = 0; i < 10; i++) {
             if (makan[i]==49) {
                 System.out.println("مکان تکرار:"+i);
             }
            
        }
    }
}
