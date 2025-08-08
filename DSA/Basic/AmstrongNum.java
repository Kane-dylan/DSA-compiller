package DSA.Basic;

import java.util.Scanner;

public class AmstrongNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int original = n;
    int len = String.valueOf(n).length();
    int sum = 0;

    while (n != 0) {
      int digit = n % 10; // last digit
      sum += Math.pow(digit, len); // add digit^len
      n /= 10; // remove last digit
    }

    System.out.println(sum == original ? "Armstrong" : "Not Armstrong");
  }
}
