package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
  public static int Fibo(int n){
    if(n<=1){
      return n;
    }else{
      return (Fibo(n-1)+ Fibo(n-2));
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println(Fibo(n));
  }
}