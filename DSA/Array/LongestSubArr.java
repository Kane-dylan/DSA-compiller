package DSA.Array;

import java.util.HashMap;
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

    // {Brute}
    //
    // int len=0;
    // for(int i=0; i<n; i++){
    //   int sum=0;
    //   for(int j=i; j<n; j++){
    //     sum+=arr[j];
    //       if(sum==K){
    //         len=Math.max(len, j-i+1);
    //       }
    //   }
    // }
    // System.out.println(len);

    // {Better}
    //
    // HashMap <Long , Integer> preSumMap = new HashMap<>();
    // long sum =0;
    // int maxLen = 0;
    // for(int i=0; i<n; i++){
    //   sum+=arr[i];
    //   if(sum == K){
    //     maxLen=Math.max(maxLen, i+1);
    //   }
    //   long remaining = sum -K;
    //   if(preSumMap.containsKey(remaining)){
    //     int len = i - preSumMap.get(remaining);
    //     maxLen = Math.max(maxLen, len);
    //   }
    //   if(!preSumMap.containsKey(sum)){
    //     preSumMap.put(sum, i);
    //   }
    // }
    // System.out.println(maxLen);

    // {Optimal}

    int left = 0;
    int right = 0;
    long sum = arr[0];
    int maxLen = 0;

    while(right < n){
      while(left <= right && sum > K){
        sum -= arr[left];
        left++; 
      }
      if(sum == K){
        maxLen= Math.max(maxLen, right-left+1);
      }
      right++;
      if(right < n)sum+=arr[right];
    }
    System.out.println(maxLen);
  }
}