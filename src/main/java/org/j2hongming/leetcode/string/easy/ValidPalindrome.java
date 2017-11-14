package org.j2hongming.leetcode.string.easy;

/**
 * @author j2hongming
 * @see https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        
        if (s == null || s.length() == 0)
            return true;
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            
            // uppercase, lowercase letter
            char st = Character.toLowerCase( s.charAt(start) );
            char en = Character.toLowerCase( s.charAt(end) );
            
            // Compare, escape not letter(punctuation)
            if( !Character.isLetterOrDigit(st) ) {
                start++;
                continue;
            }
            if( !Character.isLetterOrDigit(en) ) {
                end--;
                continue;
            }
            
            if( Character.compare(st, en) == 0 ){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
