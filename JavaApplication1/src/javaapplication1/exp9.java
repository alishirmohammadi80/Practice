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
public class exp9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("روز را وارد کنید");
       int d=input.nextInt();
        System.out.println("ماه را وارد کنید");
       int m=input.nextInt();
       System.out.println("سال را وارد کنید");
       int y=input.nextInt();
 
        if (m<=6&&d<31) {
            int newd=d+1;
            System.out.println(y+"-"+m+"-"+newd);
        }
        else if(m<=6&&d==31) {
            int newm=m+1;
            int newd=1;
            System.out.println(y+"-"+newm+"-"+newd);
        }
        else if(m==12&&d<29) {
            int newd=d+1;
             System.out.println(y+"-"+m+"-"+newd);
        }
        else if (m==12&&d==29) {
            int newd=1;
            int newm=1;
            int newy=y+1;
            System.out.println(newy+"-"+newm+"-"+newd);
        }
        else if (m<=11&&d==30) {
            int newd=1;
            int newm=m+1;
            System.out.println(y+"-"+newm+"-"+newd);
        }
        else{
            int newd=d+1;
             System.out.println(y+"-"+m+"-"+newd);
        }
}
}