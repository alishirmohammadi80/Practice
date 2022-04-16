/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp2 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      //متغیر تعداد اعداد مثبت  
        int mo=0;
        //منفی
        int ma;
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
          System.out.println("عدد را وارد کنید");
       int add=input.nextInt();
       
            if (add>0) {
               mo++; 
            }
            else if(add<0) {
                ma=add;
                sum=ma+sum;
            }
                
        }
        System.err.println("تعداد اعداد مثبت:"+mo);
        System.err.println("مجموع اعداد منفی"+sum);
    }
}
