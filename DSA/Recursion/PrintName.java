package DSA.Recursion;

import java.util.Scanner;

public class PrintName {

  // function
  public static void Name(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println("Kiran");
    Name(i + 1, n);
  }

  // function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Name(1, n);
  }
}