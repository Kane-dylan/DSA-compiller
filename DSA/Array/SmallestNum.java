package DSA.Array;

import java.util.Scanner;

public class SmallestNum {

  public static void main(String[] args) {
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
    
    // smallest and second smallest
    int Smallest = Integer.MAX_VALUE;
    int SecSmallest = Integer.MAX_VALUE;

    for(int i=n-1; i>0; i--){
      if(arr[i]<Smallest){
        SecSmallest = Smallest;
        Smallest=arr[i];
      }else if(arr[i]< SecSmallest && arr[i]!= Smallest){
        SecSmallest=arr[i];
      }
    }
    System.out.println(Smallest);
    System.out.println(SecSmallest);
  }
}