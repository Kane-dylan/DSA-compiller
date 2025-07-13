package DSA.Recursion;

import java.util.Scanner;

public class ArrSwap {
  //function
  public static void RevArr(int l,int[] arr, int r){
    if(l>=r){
      return;
    }else{
      int temp= arr[l];
      arr[l]=arr[r];
      arr[r]=temp;
    }
    RevArr(l+1, arr, r-1);
  }
  
  //function call
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    //input
    for (int i=0; i<n; i++) {
      arr[i]=sc.nextInt();
    }
    //reverse
    RevArr(0, arr, n-1);
    //output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}