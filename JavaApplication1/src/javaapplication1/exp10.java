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
public class exp10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("عدد را وارد کنید");  
        int add=input.nextInt();
        if (add<=31) {
            System.out.println("day:"+add+"month:"+1);
        }
        else if (add>=32&&add<=62) {
       
            int day=add-31;
            System.out.println("day:"+day+"month:"+2);
        }
        
         else if (add>=62&&add<=93) {
       
            int day=add-62;
            System.out.println("day:"+day+"month:"+3);
        }
           else if (add>=93&&add<=124) {
       
            int day=add-93;
            System.out.println("day:"+day+"month:"+4);
        }
          else if (add>=124&&add<=155) {
       
            int day=add-124;
            System.out.println("day:"+day+"month:"+5);
        }
        else if (add>=155&&add<=186) {
       
            int day=add-155;
            System.out.println("day:"+day+"month:"+6);
        }
         else if (add>=186&&add<=216) {
       
            int day=add-186;
            System.out.println("day:"+day+"month:"+7);
        }
         else if (add>=216&&add<=246) {
       
            int day=add-216;
            System.out.println("day:"+day+"month:"+8);
        }
         else if (add>=246&&add<=276) {
       
            int day=add-246;
            System.out.println("day:"+day+"month:"+9);
        }
         else if (add>=276&&add<=306) {
       
            int day=add-276;
            System.out.println("day:"+day+"month:"+10);
        }
         else if (add>=306&&add<=336) {
       
            int day=add-306;
            System.out.println("day:"+day+"month:"+11);
        }
         else if (add>=336&&add<=365) {
       
            int day=add-336;
            System.out.println("day:"+day+"month:"+12);
        }
    }
    
            
}
