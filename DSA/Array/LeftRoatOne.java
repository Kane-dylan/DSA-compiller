package DSA.Array;

import java.util.Scanner;

public class LeftRoatOne {

  // sample input
  // 8
  //  1 2 2 2 3 3 4 5

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }

    // num shifting
    int temp= arr[0];
    for(int i=1; i<n; i++){
      arr[i-1]=arr[i];
    }
    arr[n-1]=temp;

    // output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}