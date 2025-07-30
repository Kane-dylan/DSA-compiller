package DSA.Array;

import java.util.Scanner;

public class MissingNumOpt {

  public static void main(String[] args) {
    // sample input
    // 5
    // 1 2 3 5 
    
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n-1];
    for (int i = 0; i < n-1; i++) {
      arr[i]=sc.nextInt();
    }

    // {sum}
    // int sum=(n*(n+1))/2;
    // int s2=0;
    // for(int i=0; i<n-1; i++){
    //   s2+=arr[i];
    // }
    
    // System.out.println(sum-s2);

    //{xor}
    int xor1=0;
    // for(int i=1; i<=n; i++){
    //   xor1=xor1^i;
    // }
    int xor2=0;
    for(int i=0; i<n-1; i++){
      xor2=xor2^arr[i];
      xor1=xor1^(i+1);
    } 
    xor1=xor1^n;
    System.out.print(xor1^xor2);
  }
}