package DSA.Recursion;

import java.util.Scanner;

public class SumFn {
  //function
  public static int Sum(int i){
    if(i==0){
      return 0;
    }else{
      return (i + Sum(i - 1));      
    }
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Sum(n));
  }
}