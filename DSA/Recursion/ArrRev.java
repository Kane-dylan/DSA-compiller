package DSA.Recursion;

import java.util.Scanner;

public class ArrRev {
  public static void RevArr(int n, int i, int[] arr){
    if(i>n/2){
      return;
    }else{
      int temp= arr[i];
      arr[i]=arr[n-i-1];
      arr[n-i-1]= temp;
    }
    RevArr(n, i+1, arr);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]= new  int[n];
    //input 
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    //reverse 
    RevArr(n, 0, arr);
    //output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}