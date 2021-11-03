package exercise3;

import java.util.Scanner;

public class PrimeNumber{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int v = 2;
      boolean prime = true;
      while (num > 2) {
        if (num % 2 == 0 && num != v) {
          prime = false;
          break;
        }
        if (v == 99){
          break;
        }
        v++;
        }
     System.out.println("PrimeNumber: " + prime);
   }
}