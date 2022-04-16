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
public class exp3 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.err.println("عدد اول");
        int add1=input.nextInt();
        System.err.println("عدد دوم");
       int add2=input.nextInt();
        if (add1%add2==0) {
            System.err.println("تقسییم پذیر است");   
        }
        else{
            System.err.println("نیست");
        }
    }
}
