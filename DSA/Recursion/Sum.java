package DSA.Recursion;

import java.util.Scanner;

public class Sum {
  //function
  public static void Sum(int i, int sum){
    if(i<1){
      System.out.print(sum);
      return;
    }
    Sum(i-1,sum+i);
  }
  //function call
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    Sum(n, 0);
  }
}