package DSA.Sorting;

import java.util.Scanner;

public class BubbleSortFn {

  public static void BubbleSort(int n, int arr[]){
    for(int i=n-1; i>=1; i--){
      int didSwap = 0;
      for(int j=0; j<=i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
          didSwap=1;
        }
      }
      // optimized version
      if(didSwap == 0){
        break;
      }
      System.out.println("runs");
    }
  } 

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }
    // function call
    BubbleSort(n, arr);
    // output 
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}