package DSA.Recursion;

import java.util.Scanner;

public class PrintNewNum{
  //function
  public static void NewNum(int i, int n){
    if(i<1){
      return;
    }
    System.out.print(i+" ");
    NewNum(--i,n);
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    NewNum(n, n);
  }
}