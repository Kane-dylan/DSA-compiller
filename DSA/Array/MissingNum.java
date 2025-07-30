package DSA.Array;

import java.util.Scanner;

public class MissingNum {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n-1];
    for (int i = 0; i < n-1; i++) {
      arr[i]=sc.nextInt();
    }


    // {brute approach}
    // for(int i=1; i<=n; i++){
    //   int missing = 0;
    //   for(int j=0; j<n-1; j++){
    //     if(arr[j]== i){
    //       missing=1;
    //       break;
    //     }
    //   }
    //   if(missing==0){
    //     System.out.print(i);
    //   }
    // }

    int hash[]= new int[n+1];
    for(int i=0; i<n-1; i++){
      hash[arr[i]]=1;
    }
    for(int i=1; i<=n; i++){
      if(hash[i]==0){
        System.out.println(i);
      }
    }
  }
}