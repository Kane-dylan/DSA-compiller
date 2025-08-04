package DSA.Array;

import java.util.Scanner;

public class RightRotateDth {
  
  // sample input
  // 8
  // 1 2 0 4 5 0 7 8

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    int d=sc.nextInt();
    d=d%n;
    int k=n-d;
    int temp[]= new int[k];
    // algo 
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }
    
    for(int i=k; i<n; i++){
      arr[i-k]= arr[i];
    }
    for(int i=n-k; i<n; i++){
      arr[i]=temp[i-(n-k)];
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}