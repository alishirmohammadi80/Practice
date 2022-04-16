
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=0;
        int avrag=0;
        int[]daramad=new int[5];
        String[]name=new String[5];
        for (int i = 0; i <5; i++) {
            System.out.println("نام را وارد کنید");
            name[i]=input.next();
            System.out.println("میزان حقوق");
            daramad[i]=input.nextInt();
        }
 
        for (int i = 0; i < 5; i++) {
            avrag=avrag+daramad[i];   
        }
        System.out.println("میانگین:"+avrag/5);
        int c = 0;
        for (int i = 0; i <5; i++) {
            if (daramad[i]>20000) {
                c++;
            }
        }
        System.out.println("تعداد افراد حقوق بالا:"+c);
      int namei = 0;
        max=daramad[0];
        for (int i = 1; i < 5; i++) {
            if (daramad[i]>max) {
                max=daramad[i];
                namei=i;
            }
        }
            System.out.println("بیشترین حقوق"+max);
            System.out.println("نام فرد"+name[namei]);
       
    }
 
}
