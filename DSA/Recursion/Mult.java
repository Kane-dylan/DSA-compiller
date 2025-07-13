package DSA.Recursion;

import java.util.Scanner;

public class Mult {

  //function
  public static void Mult(int i , int mult){
    if(i<1){
      System.out.println(mult);
      return;
    }
    Mult(i-1, mult*i);   
  }
  //function call
  public static void main(String[] args) {
    Scanner cs=new Scanner(System.in);
    int n =cs.nextInt();
    Mult(n, 1);
  }
}