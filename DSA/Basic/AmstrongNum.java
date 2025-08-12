package DSA.Basic;

import java.util.Scanner;

public class AmstrongNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int dup =n; // duplicate the num
    int digits = String.valueOf(n).length();
    int sum =0;
    while(n > 0){
      int digit=n%10;
      sum +=Math.pow(digit, digits);// length in the power 
      n/=10;
    }
    System.out.println(sum == dup ? "true" : "false");
  }
}
