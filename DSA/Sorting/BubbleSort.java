package DSA.Sorting;

import java.util.Scanner;

public class BubbleSort {

  // input samples
  // no. 7 
  // arr 9 5 4 7 16 22 21
  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }

    //algo
    for(int i=n-1; i>=1; i--){
      for(int j=0; j<=i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
      }
    }

    //output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}