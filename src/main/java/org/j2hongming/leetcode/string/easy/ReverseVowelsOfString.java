package org.j2hongming.leetcode.string.easy;

import java.util.Stack;

/**
 * @author LeeREVO  ninacc 
 * @see https://discuss.leetcode.com/topic/47057/java-solution-using-stack
 * @see https://discuss.leetcode.com/topic/43412/java-standard-two-pointer-solution
 *
 */
public class ReverseVowelsOfString {

	public static void main(String[] args) {
		System.out.println( reverseVowels("hello") );

		System.out.println( reverseVowelsTwoPoint("hello") );
		
		System.out.println( reverseVowels("leetcode") );

		System.out.println( reverseVowelsTwoPoint("leetcode") );
	}
	
	
	public static String reverseVowels(String s) {
	    char[] chars = s.toCharArray();
	    Stack<String> rev = new Stack<String>();
	    String vowels = "aeiouAEIOU";
	    
	    for(char c:chars){
	        if(vowels.contains(c+""))
	            rev.push(c+"");
	    }
	    
	    for(int i = 0; i < chars.length ; i++ ){
	        if(vowels.contains(chars[i]+""))
	            chars[i] = rev.pop().charAt(0);
	    }
	    return new String(chars);
	}

	public static String reverseVowelsTwoPoint(String s) {
	    if(s == null || s.length()==0) return s;
	    String vowels = "aeiouAEIOU";
	    char[] chars = s.toCharArray();
	    int start = 0;
	    int end = s.length()-1;
	    while(start<end){
	        
	        while(start<end && !vowels.contains(chars[start]+"")){
	            start++;
	        }
	        
	        while(start<end && !vowels.contains(chars[end]+"")){
	            end--;
	        }
	        
	        char temp = chars[start];
	        chars[start] = chars[end];
	        chars[end] = temp;
	        
	        start++;
	        end--;
	    }
	    return new String(chars);
	}
}
