package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionSortedArr {

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

    ArrayList<Integer> intsec= new ArrayList<>(); 
    int visited[]=new int[n2];
    for(int i=0; i<n1; i++){
      for(int j=0; j<n2; j++){
        if(arr1[i]== arr2[j] && visited[j]== 0){
          intsec.add(arr1[i]);
          visited[j]=1;
          break;
        }
        if(arr2[j]> arr1[i]) {
          break;
        }
      }
    }

    for(int i=0; i<intsec.size(); i++){
      System.out.print(intsec.get(i)+" ");
    }
  }
}