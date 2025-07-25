package DSA.Basic;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();

    int rev=0;
    int dup=n;
    while (n!=0) {
      rev=rev*10+n%10;
      n/=10;
    }
    if(rev==dup){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}