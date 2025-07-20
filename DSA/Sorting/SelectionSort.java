package DSA.Sorting;

import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    //input
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    int arr[]= new int[size];
    for(int i=0; i<size; i++){
      arr[i]=sc.nextInt();
    }   
    //Select min & swap
    for(int i=0; i<=size-2; i++){
      int min=i;
      for(int j=i; j<=size-1; j++){
        if(arr[j] < arr[min]){
          min=j;
        }
      }
      int temp=arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
    }
    //output
    for (int i=0; i<size; i++){
      System.out.print(arr[i]+" ");
    }
  }
}