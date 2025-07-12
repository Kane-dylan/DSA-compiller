package DSA.Test;

import java.util.Scanner;

public class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();

    int cnt=0;
    while(x!=0){
      int LD=x%10;
      cnt++;
      x /= 10;
    }
    System.out.println(cnt);
  }
}