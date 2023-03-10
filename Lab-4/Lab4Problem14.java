package lab4problem14;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Problem14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first String : ");
        String s1 = input.nextLine();
        System.out.print("Input the second String : ");
        String s2 = input.nextLine();
        anagramcheck(s1,s2);
    }

    static void anagramcheck(String s3, String s4) {
        boolean anagram = true;
        if (s3.length() != s4.length()) {
            anagram = false;
        } else {
            char[] s5 = s3.toLowerCase().toCharArray();
            char[] s6 = s4.toLowerCase().toCharArray();
            Arrays.sort(s5);
            Arrays.sort(s6);
            anagram = Arrays.equals(s5, s6);
        }
        if (anagram) {
            System.out.println(s3 + " and " + s4 + " are Anagram");
        } else {
            System.out.println(s3 + " and " + s4 + " are not Anagram ");
        }
    }
}
