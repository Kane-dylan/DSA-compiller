package DSA.Recursion;

import java.util.Scanner;

public class Palindorme {
  public static boolean Palindorme(int i, int n, String str){
    if(i>=n/2){
      return true;
    }else{
      if (str.charAt(i)!=str.charAt(n-i-1)) {
        return false;
      }
    }
    return Palindorme(i+1, n, str);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    System.out.println(Palindorme(0, s.length(), s));
  }
}