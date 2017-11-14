package org.j2hongming.leetcode.string.easy;

/**
 * @author  j2hongming
 * @see https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

	public static void main(String[] args) {

		System.out.println( lengthOfLastWord("") );
		System.out.println( lengthOfLastWord("Hello World") );
		System.out.println( lengthOfLastWord("When we ask Springboard students why they chose to learn with") );
		System.out.println( lengthOfLastWord("Take Andrew Flowers, a Springboard mentor") );
		System.out.println( lengthOfLastWord(" ") );
	}

	public static int lengthOfLastWord(String s) {
        if(s != null && !s.isEmpty()) {
           String[] result = s.split(" ");
           return (result.length > 0) ? result[result.length-1].length() : 0 ;
       }
       else{
           return 0;
       }
   }
}
