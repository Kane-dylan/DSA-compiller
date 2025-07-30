package DSA.Array;

import java.util.Scanner;

public class MaxCosecutive {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < n; i++) {
      arr[i]=sc.nextInt();
    }

    int cnt=0;
    int max=0;
    for(int i=0; i<n; i++){
      if(arr[i]==1){
        cnt++;
        max= Math.max(max, cnt);
      }else{
        cnt=0;
      }
    }
    System.out.println(max);
  }
}