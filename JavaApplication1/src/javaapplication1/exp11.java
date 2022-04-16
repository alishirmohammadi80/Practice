
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("میزان مصرف");
        int masraf=input.nextInt();
        if (masraf<=300) {
          int hazine=masraf*3; 
            System.out.println("میزان مصرف به ریال:"+hazine);
        }
        if (masraf>=301&&masraf<=400) {
        int tasaod=masraf-300;
        int hazine=(300*3)+(tasaod*3);
          System.out.println("میزان مصرف به ریال:"+hazine);
        }
         if (masraf>=401&&masraf<=600) {
          int hazine=300*3;
          int tasaod1=100*3;
          int tasaod2=masraf-400;
          int total=hazine+tasaod1+(tasaod2*6);
          System.out.println("میزان مصرف به ریال:" +total);
        }
        
         else{
             int hazine=300*3;
          int tasaod1=100*3;
          int tasaod2=200*6;       
          int tasaod3=masraf-600;   
          int total=hazine+tasaod1+tasaod2+(tasaod3*10);
           System.out.println("میزان مصرف به ریال:" +total);
         }
    }
    
    
}
