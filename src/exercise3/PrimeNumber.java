package exercise3;

import java.util.Scanner;

public class PrimeNumber{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int v = 2;
      boolean prime = true;
      while (prime && (v <= num)) {
        if (num % v == 0) {
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