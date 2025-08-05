package DSA.Array;

import java.util.Scanner;

public class LongestSubArr {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    
    }

    int K=sc.nextInt();

    int len=0;
    for(int i=0; i<n; i++){
      int sum=0;
      for(int j=i; j<n; j++){
        sum+=arr[j];
          if(sum==K){
            len=Math.max(len, j-i+1);
          }
      }
    }
    System.out.println(len);
  }
}