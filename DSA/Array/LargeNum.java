package DSA.Array;

import java.util.Scanner;

public class LargeNum {

  public static void main(String[] args) {
    // sample input
    // 8
    // 4 6 2 5 7 9 1 3 

    // input
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    // logic
    int large= 0;
    for(int i=0; i<n-1; i++){
      if(arr[i]>large){
        large=arr[i];
      }
    }
    System.out.println(large);
  }
}