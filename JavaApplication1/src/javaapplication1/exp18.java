
package javaapplication1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ali
 */
public class exp18 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String[]name=new String[5];
    int[]vazn=new int[5];
    int[]sen=new int[5];
    
        for (int i = 0; i < 5; i++) {
            System.out.println("نام را وارد کنید"); 
            name[i]=input.next();
            System.out.println("وزن را وارد کنید");
            vazn[i]=input.nextInt();
             System.out.println("سن را وارد کنید");
             sen[i]=input.nextInt();
             
        }
       Arrays.sort(vazn);
        for (int i =4; i>=0; i--) {
            System.out.println("-------------");
            System.out.println("نام:"+name[i]);
            System.out.println("وزن:"+vazn[i]);
            System.out.println("سن:"+sen[i]);
        }
    }
    
}
