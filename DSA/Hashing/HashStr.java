package DSA.Hashing;

import java.util.Scanner;

public class HashStr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    String s = sc.nextLine();

    //precomputing
    int hash[] = new int[26];
    for(int i=0;i<s.length();i++){
      hash[s.charAt(i)-'a']++;
    }
    
    int q=sc.nextInt();
    // sc.nextLine();
    while (q>0) {
      char c=sc.next().charAt(0);
      //fetch
      System.out.println(hash[c-'a']);
      q--;
    }
  }
}