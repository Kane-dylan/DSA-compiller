package DSA.Recursion;

import java.util.Scanner;

public class MultFn {

  //function
  public static int Mult(int i){
    if(i==0){
      return 1;
    }else{
      return (i*Mult(i-1));
    }
  }
  //function call
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    System.out.println(Mult(n));
  }
}