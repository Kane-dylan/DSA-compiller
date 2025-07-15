package DSA.Hashing;

import java.util.Scanner;

public class HashAll {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String s = sc.nextLine();

    // precomputing
    int hash[] = new int[256]; // as this using the full length of the ASCII
    for(int i =0; i<s.length();i++){
      hash[s.charAt(i)]+=1;
    }

    //query check
    int q=sc.nextInt();
    while (q>0) {
      char c = sc.next().charAt(0);
      System.out.println(hash[c]);
      q--;
    }
  }
}