package org.j2hongming.leetcode.string.easy;

/**
 * @author ILoveGoogle
 * @see https://discuss.leetcode.com/topic/12173/fast-and-simple-java-code-231ms/6
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] t = {"abcty","abc","abcz"};
		System.out.println( longestCommonPrefix(t) );
	}

    public static String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) return "";
        
        StringBuilder lcp = new StringBuilder();
        
        for(int i = 0 ; i < strs[0].length() ; i++){
            
            char c = strs[0].charAt(i);
            
            for(String s : strs){
                if( s.length() < i+1 || c != s.charAt(i) ) return lcp.toString();
            }
            
            lcp.append(c);
        }
        return lcp.toString();
    }
}
