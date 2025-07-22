package DSA.Sorting;

import java.util.Scanner;

public class SelectionSortRec {

  public static void SelectionSort(int n, int arr[]){
    for(int i=0; i<=n-2; i++){
      int min=i;
      for(int j=i; j<=n-1; j++){
        if(arr[j]<arr[min]){
          min=j;
        }
      }
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
      System.out.println("runs");
    }
  }

  public static void main(String[] args) {
    //input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    //function call
    SelectionSort(n, arr);
    //output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}