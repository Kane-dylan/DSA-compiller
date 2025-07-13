package DSA.Recursion;

import java.util.Scanner;

public class PrintNewNo{
  //function
  public static void NewNum(int i, int n){
    if(i<1){
      return;
    }
    NewNum(--i,n);
    System.out.println(i+" ");
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    NewNum(n, n);
  }
}