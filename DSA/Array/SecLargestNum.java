package DSA.Array;

import java.util.Scanner;

public class SecLargestNum {

  public static void main(String[]args){
    // sample input
    // 8
    // 4 6 2 5 7 9 1 3

    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }

    int large=arr[0];
    int SecLarge=-1;

    // {better}

    // for(int i=0; i<n-1; i++){
    //   if(arr[i]>large){
    //     large=arr[i];
    //   }    
    // }
    // for(int i=0; i<n-1; i++){
    //   if(arr[i]>SecLarge && arr[i]!= large){
    //     SecLarge= arr[i];
    //   }
    // }

    // {optimal}
    
    for(int i=0; i<n; i++){
      if(arr[i]>large){
        SecLarge = large;
        large=arr[i];
      }else if(arr[i]>SecLarge && arr[i]!= large){
        SecLarge=arr[i];
      }
    }

    System.out.println(SecLarge);
  }
}