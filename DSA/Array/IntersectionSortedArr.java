package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionSortedArr {
  // sample input
  //8 
  //1 2 2 3 3 4 5 6
  // 7
  // 2 3 3 5 6 6 7
  
  public static void main(String[] args) {
    // input
    Scanner sc=new Scanner (System.in);
    int n1= sc.nextInt();
    int arr1[]=new int[n1]; 
    for (int i = 0; i < n1; i++) {
      arr1[i]=sc.nextInt();
    }
    int n2= sc.nextInt();
    int arr2[]=new int[n2]; 
    for (int i = 0; i < n2; i++) {
      arr2[i]=sc.nextInt();
    }

    // declare empty arr & visited copy of arr2
    ArrayList<Integer> intsec= new ArrayList<>(); 
    int visited[]=new int[n2];
    for(int i=0; i<n1; i++){
      for(int j=0; j<n2; j++){
        if(arr1[i]== arr2[j] && visited[j]== 0){
          intsec.add(arr1[i]);
          visited[j]=1;
          break;
        }
        // when arr2 element is already greater than arr1 then no check
        if(arr2[j]> arr1[i]) {
          break;
        }
      }
    }

    // output
    for(int i=0; i<intsec.size(); i++){
      System.out.print(intsec.get(i)+" ");
    }
  }
}