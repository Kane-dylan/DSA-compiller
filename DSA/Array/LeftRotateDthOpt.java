package DSA.Array;

import java.util.Scanner;

public class LeftRotateDthOpt {

  // sample input
  // 8
  // 1 2 2 2 3 3 4 5
  // 4 // d value;

    
  public static void RotateLeft(int arr[], int n, int d){
    // reverse 0 to d element
    reverse(arr,0,d-1);
    // reverse d to n-1
    reverse(arr,d,n-1);
    // reverse 0 to n-1
    reverse(arr,0,n-1);
  }

  public static void reverse(int arr[], int start, int end){
    // reverse function
    while (start<= end) {
      int temp= arr[start];
      arr[start]= arr[end];
      arr[end]= temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }
    // d 
    int d= sc.nextInt();
    d=d%n;

    // function call
    RotateLeft(arr, n, d);

    // output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}