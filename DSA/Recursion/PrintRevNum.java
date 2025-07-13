package DSA.Recursion;

import java.util.Scanner;

public class PrintRevNum{
  //function
  public static void RevNum(int i, int n){
    if(i<1){
      return;
    }
    System.out.print(i+" ");
    RevNum(--i,n);
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    RevNum(n, n);
  }
}