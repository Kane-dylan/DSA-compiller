package DSA.Hashing;

import java.util.Scanner;

public class HashNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    // input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // precompute
    int hash[] = new int[100000000];
    for (int i = 0; i < size; i++) {
      hash[arr[i]] += 1;
    }

    // output
    int q = sc.nextInt();
    while (q>0) {
      int num = sc.nextInt();
      // fetch
      System.out.println(hash[num]);
      q--;
    }
  }
}