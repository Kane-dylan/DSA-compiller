package DSA.Sorting;

import java.util.Scanner;

public class QuickSort {

  // Quick Sort
  public static void QuickSort(int arr[], int low, int high){
    if(low<high){
      int pvt= Pvt(arr,low,high);
      QuickSort(arr,low,pvt-1);
      QuickSort(arr,pvt+1, high);
    }
  }

  // pivot element
  public static int Pvt(int arr[],int low,int high){
    int pivot=arr[low];
    int i= low;
    int j= high;
    while (i<j) {
      while (arr[i]<= pivot && i<=high-1) {
        i++;
      }
      while (arr[j]> pivot && j>=low+1) {
        j--;
      }
      if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    // swap with the low 
      int temp=arr[low];
      arr[low]=arr[j];
      arr[j]=temp;
    return j;
  }

  public static void main(String[] args) {
    //input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }

    // function call
    QuickSort(arr,0,n-1);

    // output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}