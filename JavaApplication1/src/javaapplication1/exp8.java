

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp8 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int add=input.nextInt();
        for (int i = 1; i <= add; i++) {
            if (add%i==0) {
                System.out.println(i);
            }
            
            
        }
        
    }
}
