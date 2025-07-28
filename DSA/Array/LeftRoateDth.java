package DSA.Array;

import java.util.Scanner;

public class LeftRoateDth {

  // sample input
  // 8
  // 1 2 2 2 3 3 4 5
  // 4 // d value;

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    int d=sc.nextInt();
    d=d%n;
    // store up-to d th element in the temp 
    int temp[]=new int[d];
    for(int i=0; i<d; i++){
      temp[i]=arr[i];
    }
    // bring the last elements in the front
    for(int i=d; i<n; i++){
      arr[i-d]=arr[i];
    }
    // replacing the arr element in the end 
    for(int i=n-d; i<n; i++){
      arr[i]=temp[i-(n-d)];
    }

    // output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}