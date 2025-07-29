package DSA.Array;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionSortedArr {

  // sample input
  // 8 // n1
  // 0 1 2 3 3 6 7 9
  // 5 // n2
  // 3 5 6 7 8

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

    Set<Integer> st = new TreeSet<Integer>();
      for(int i=0; i<n1; i++){
        st.add(arr1[i]);
      }
      for(int i=0; i<n2; i++){
        st.add(arr2[i]);
      }
    System.out.println(st);

    int[] union = new int[st.size()];
    int idx = 0;
    for (int num : st) {
      union[idx++] = num;
    }
    
    for (int i = 0; i < union.length; i++) {
      System.out.print(union[i]+" ");
    }
  }
}