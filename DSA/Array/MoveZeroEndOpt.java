package DSA.Array;

import java.util.Scanner;

public class MoveZeroEndOpt {

  // sample input
  // 8 
  // 1 2 0 4 5 0 7 8


  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    // j at 0th element 
    int j=-1;
    for(int i=0; i<n; i++){
      if(arr[i]== 0){
        j=i;
        break;
      }
    }

    // swapping i with the non zero elements
    for(int i=j+1; i<n; i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        j++;
      }
    }

    // output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}