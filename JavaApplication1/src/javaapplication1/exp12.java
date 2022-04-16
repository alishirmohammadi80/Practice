
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int[] nomre=new int[10];
        for (int i = 0; i <10; i++) {
            System.out.println("نمره را وارد کنید:");
          nomre[i]=input.nextInt();
        }
        for (int i = 0; i <10; i++) {
 
   sum=sum+nomre[i];
          
        }
      int avrag=sum/nomre.length;
        System.out.println("میانگین:"+avrag);
        int kamtar=0;
        int bishtar=0;
        for (int i = 0; i <10; i++) {
            int shomaresh=nomre[i];
            if (shomaresh<avrag) {
                kamtar++;
            }
            else if (shomaresh>avrag) {
                 bishtar++; 
            }
  
        }
         System.out.println("تعداد کم ترین"+kamtar);
          System.out.println("تعداد بیشترین"+bishtar);
    }
    
    
    
}
