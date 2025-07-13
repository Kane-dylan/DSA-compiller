package DSA.Recursion;

import java.util.Scanner;

public class PrintNewRevNum{
  //function
  public static void NewRevNo(int i, int n){
    if(i>=n){
      return;
    }
    NewRevNo(++i,n);
    System.out.print(i+" ");
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    NewRevNo(0,n);
  }
}