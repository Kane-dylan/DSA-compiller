package DSA.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

  // sample input
  // 7
  // 9 5 4 7 16 22 21

  // devide algo
  public static void MergeSort(int arr[], int low, int high){
    if(low>=high) return;
    int mid=(low+high)/2;
    MergeSort(arr, low, mid);
    MergeSort(arr, mid+1, high);
    Merge(arr,low,mid,high);
  }

  // merge algo
  public static void Merge(int arr[],int low,int mid,int high){
    ArrayList<Integer> temp= new ArrayList<>();
    int left= low;
    int right= mid+1;
    while (left<=mid && right<=high) {
      if(arr[left]<=arr[right]){
        temp.add(arr[left]);
        left++;
      }else{
        temp.add(arr[right]);
        right++;
      } 
    }
    
    while(left<=mid){
      temp.add(arr[left]);
      left++;
    }
    while (right<= high) {
      temp.add(arr[right]);
      right++;
    }
    
    for(int i=low; i<= high; i++){
      arr[i]=temp.get(i-low);
    }
  }
  
  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    // function call
    MergeSort(arr, 0, n-1);
    
    // output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}