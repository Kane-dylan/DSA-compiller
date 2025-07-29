package DSA.Array;

import java.util.Scanner;

public class RightRotateDthOpt {

  // sample input
  // 8
  // 1 2 2 2 3 3 4 5
  // 4 // d value;

  // recursion
  public static void RightRotate(int arr[], int n, int k){
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    reverse(arr,0,n-1);
  }

  // reverse function
  public static void reverse(int arr[], int start, int end){
    while(start<=end){
      int temp= arr[start];
      arr[start]= arr[end];
      arr[end]= temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    int d= sc.nextInt();
    d=d%n;
    int k=n-d;

    // function call
    RightRotate(arr,n, k);

    // output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}