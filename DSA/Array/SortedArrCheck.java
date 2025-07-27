package DSA.Array;

import java.util.Scanner;

public class SortedArrCheck {

  public static void main(String[] args) {
    // sample input
    // 8
    // 4 6 2 5 7 9 1 3

    // input
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    // check
    boolean isSorted = true;
    for(int i=1; i<n; i++){
      if(arr[i]<=arr[i-1]){
        isSorted= false;
        break ;
      }
    }
    if(isSorted){
      System.out.println("Array is sorted");
    }else{
      System.out.println("Array is not sorted");
    }
  }
}