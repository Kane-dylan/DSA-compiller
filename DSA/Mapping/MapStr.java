package DSA.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class MapStr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    //precomputing
    HashMap <Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }

    //query check
    int q=sc.nextInt();
    while(q>0){
      char c =sc.next().charAt(0);
      System.out.println(map.getOrDefault(c, 0));
      q--;
    }
  }
}