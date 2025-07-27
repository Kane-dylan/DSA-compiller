package DSA.Array;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class RemoveDup {

  // sample input
  // 8
  // 1 2 2 2 3 3 4 5 {only works for the sorted array}
  public static void main(String[] args) {
    // input
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    // Set<Integer> st = new HashSet<Integer>();
    // for(int i=0; i<n; i++){
    //   st.add(arr[i]);
    // }

    // int index= 0;
    // for(int i:st){
    //   arr[index]=i;
    //   index++;
    // }
    // System.out.print(st);
    // System.out.print(index);

    // logic
    int i=0;
    for(int j=1; j<n; j++){
        if(arr[j]!=arr[i]){
          arr[i+1]=arr[j];
          i++;
        }
    }
    System.out.println(i+1);

    }
  }
