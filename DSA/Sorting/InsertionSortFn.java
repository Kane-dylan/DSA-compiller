package DSA.Sorting;

import java.util.Scanner;

public class InsertionSortFn {

  // input samples
  // no. 7
  // arr 9 5 4 7 16 22 21

  public static void InsertionSort(int n, int arr[]){
    // Also
    for(int i=0; i<=n-1; i++){
      int j=i;
      while (j>0 && arr[j-1]> arr[j]) {
        int temp= arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        j--;        
      }
    }
  }
  
  public static void main(String[] args) {
    // inputs
    Scanner sc= new Scanner(System.in);
    int n = sc. nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    // fn call
    InsertionSort(n,arr);

    // output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}