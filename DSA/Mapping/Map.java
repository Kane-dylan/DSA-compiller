package DSA.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

  public static void main(String[] args) {
    // input
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int arr[] = new int[s];
    for (int i = 0; i < s; i++) {
      arr[i] = sc.nextInt();
    }

    // precomputing
    // int map[]=new map(int,int);
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < s; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    // map value
    for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    // query check
    int q = sc.nextInt();
    while (q > 0) {
      int n = sc.nextInt();
      System.out.println(map.getOrDefault(n, 0));
      q--;
    }
  }
}