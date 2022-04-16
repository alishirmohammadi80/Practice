/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ali
 */
public class exp5 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 104; i <=994 ; i=i+10) {
            sum=i+sum;
            System.out.println(i);  
        }
        System.out.println("مجموع:"+sum);
    }
   
}
