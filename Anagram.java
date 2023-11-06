import java.util.*;
public class Anagram {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter first String: ");
    String s1 = s.nextLine();
    System.out.print("Enter second String: ");
    String s2 = s.nextLine();
    if(s1.length() == s2.length()) {
      char[] c1 = s1.toCharArray();
      char[] c2 = s2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean result = Arrays.equals(c1, c2);
if(result) {
        System.out.println("String is anagram");
  }
  else{
      System.out.println("String is not anagram");
  }}
}}