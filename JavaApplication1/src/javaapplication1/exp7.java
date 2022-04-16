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
public class exp7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("عدد را وارد کنید");
        int add=input.nextInt();
        int result=0;
        while (add>0) {            
            int yekan=add%10;
            result=result*10+yekan;
            add=add/10;
        }
        System.out.println(result);
    }
    
}
