package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionSortedArrOpt {

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

    ArrayList <Integer> intsec = new ArrayList<>();
    int i=0;
    int j=0;
    while(i< n1 && j< n2){
      if(arr1[i]<arr2[j]){
        i++;
      }else if(arr1[i] > arr2[j]){
        j++;
      }else{
        intsec.add(arr1[i]);
        i++;
        j++;
      }
    }
    
    for (int j2 = 0; j2 <intsec.size(); j2++) {
      System.out.print(intsec.get(j2)+" ");
    }
  }
}