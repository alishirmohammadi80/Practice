
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author ali
 */
public class exp16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] nomre=new int[5];
        int[]shomaredansh=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("شماره دانشجویی");
              shomaredansh[i]=input.nextInt();
            System.out.println("نمره دانشجو را وارد کنید");
             nomre[i]=input.nextInt();
           
    }
        for (int i = 0; i < 5; i++) {
            if (nomre[i]<10) {
                System.out.println("شماره دانشجویی"+shomaredansh[i]+"--"+"نمره:"+"F");
            }
            else if (nomre[i]>=10&&nomre[i]<12) {
                 System.out.println("شماره دانشجویی"+shomaredansh[i]+"--"+"نمره:"+"D");
            }
             else if (nomre[i]>=12&&nomre[i]<14) {
                 System.out.println("شماره دانشجویی"+shomaredansh[i]+"--"+"نمره:"+"C");
            }
             else if (nomre[i]>=14&&nomre[i]<17) {
                 System.out.println("شماره دانشجویی"+shomaredansh[i]+"--"+"نمره:"+"B");
            }
             else{
                  System.out.println("شماره دانشجویی"+shomaredansh[i]+"--"+"نمره:"+"A");
             }
        }
        
}
}