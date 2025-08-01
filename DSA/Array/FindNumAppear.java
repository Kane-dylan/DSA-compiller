package DSA.Array;

import java.util.Scanner;

public class FindNumAppear {
  // sample input
  // 7
  // 1 1 2 3 3 4 4

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    // {Brute}
    // for(int i=0; i<n; i++){
    //   int cnt=0;
    //   for(int j=0; j<n; j++){
    //     if(arr[j]==arr[i]){
    //       cnt++;
    //     }
    //   }
    //   if(cnt==1){
    //     System.out.println(arr[i]);
    //   }
    // }

    // {Better}
    // int max=arr[0];
    // for(int i=0; i<n; i++){
    //   max=Math.max(max, arr[i]);
    // }
    // int hash[]=new int[max+1];
    // for(int i=0; i<n; i++){
    //   hash[arr[i]]++;
    // }
    // for(int i=0; i<n; i++){
    //   if(hash[arr[i]]==1){
    //     System.out.println(arr[i]);
    //   }
    // }

    // {Optimal-xor}
    int xor=0;    
    for(int i=0; i<n; i++){
      xor=xor^arr[i];
    }
    System.out.println(xor);
  }
}