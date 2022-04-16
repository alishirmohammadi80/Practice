
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class exp20 {
    public static void main(String[] args) {
         Scanner intput = new Scanner(System.in);
      int a = 1, b = 1, c = 0, n;

      System.out. println("عدد را وارد کنید:");
      n = intput.nextInt();

      while (c < n) {
          c = a + b;
          a = b;
          b = c;
      }
      if (c == n)
          System.out. println(n + " دنباله فیبوناچی هست");
      else
          System.out. println(n + " دنباله فیبوناچی نیست");
  }
    }

