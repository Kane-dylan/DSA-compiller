package DSA.Array;

import java.util.Scanner;

public class LinearSearch {
  // sample input
  // 8 
  // 1 2 0 4 5 0 7 8 5

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }

    // searching !? return index
    int s=sc.nextInt();
    boolean found=false;
    for(int i=0; i<n; i++){
      if(arr[i]== s){
        System.out.println(i);
        found=true;
      }
    }
    if (!found) {      
      System.out.println(-1);
    }
  }
}