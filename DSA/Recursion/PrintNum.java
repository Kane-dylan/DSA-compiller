package DSA.Recursion;

import java.util.Scanner;

public class PrintNum{
  //function
  public static void Num(int i, int n){
    if(i>n){
      return;
    }
    System.out.print(i+" ");
    Num(++i, n);
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    Num(1, n);
  }
}