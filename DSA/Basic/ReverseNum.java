package DSA.Basic;

import java.util.Scanner;

public class ReverseNum {

  //sample input
  // 6754433
  public static void main(String[] args) {

    // input 
    Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
    // rev
    long rev=0;
    while (n!=0) {
      rev=rev*10+n%10;
      n=n/10;
      if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
        System.out.println(0);
        return;
      }
    }
    System.out.println(rev);
  }
}