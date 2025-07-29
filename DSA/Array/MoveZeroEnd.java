package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroEnd {

  // sample input
  // 8
  // 1 2 0 4 5 0 7 8

  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }

    // nonZero added to the temp array
    ArrayList <Integer> temp = new ArrayList<>();
    for(int i=0; i<n; i++){
      if(arr[i]!= 0){
        temp.add(arr[i]);
      }
    }

    int nonZero = temp.size();
    // putting nonZero elements into the array
    for(int i=0; i<nonZero; i++){
      arr[i]= temp.get(i);
    }

    //adding zero in the empty places in the array
    for(int i=nonZero; i<n; i++){
      arr[i]=0;
    }

    //output
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }

  }
}