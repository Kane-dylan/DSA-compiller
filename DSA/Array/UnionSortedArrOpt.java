package DSA.Array;

import java.util.*;

public class UnionSortedArrOpt {

  // sample input
  // 8 // n1
  // 0 1 2 3 3 6 7 9 
  // 5 // n2
  // 3 5 6 7 8

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }

    ArrayList<Integer> union = new ArrayList<>();
    int a = 0;
    int b = 0;

    while (a < n1 && b < n2) {
      if (arr1[a] <= arr2[b]) {
        if (union.isEmpty() || union.get(union.size() - 1) != arr1[a]) {
          union.add(arr1[a]);
        }
        a++;
      } else {
        if (union.isEmpty() || union.get(union.size() - 1) != arr2[b]) {
          union.add(arr2[b]);
        }
        b++;
      }
    }

    while (a < n1) {
      if (union.isEmpty() || union.get(union.size() - 1) != arr1[a]) {
        union.add(arr1[a]);
      }
      a++;
    }

    while (b < n2) {
      if (union.isEmpty() || union.get(union.size() - 1) != arr2[b]) {
        union.add(arr2[b]);
      }
      b++;
    }

    for (int i = 0; i < union.size(); i++) {
      System.out.print(union.get(i) + " ");
    }
  }
}
