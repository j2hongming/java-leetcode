package org.j2hongming.leetcode.string.easy;

public class StrStr {

	public static void main(String[] args) {

//		System.out.println( strStr("haystackmostau", "sta") );
//		System.out.println( strStr("haystsckmostau", "sta") );
//		System.out.println( strStr("haystsckmosuuu", "sta") );
//		System.out.println( strStr("", "") );
//		System.out.println( strStr("aaa", "aaaa") );
		System.out.println( strStr("a", "a") );
//		System.out.println( strStr("mississippi", "issipi") );
	}
	
    public static int strStr(String haystack, String needle) {
    	
    	if( needle.length() == 0 ) return 0;
        if( haystack.length() == 0  ) return -1;
        
        int hidx = 0;
        char hchar;
        char nchar = needle.charAt(0);
        
        // traversal haystack
        while( hidx < haystack.length() ){
        	hchar = haystack.charAt(hidx);
            if(hchar != nchar){
                hidx++;
            }
            else{
                // Compare Process
                if( compareStr(haystack, needle, hidx+1) ){
                    return hidx;
                }
                hidx++;
            }
        }
        
        return -1;
    }
    
    public static boolean compareStr(String haystack, String needle, int hidx){
        int nidx = 1;
        boolean flag = true;
        int count = 1;
        
        while( nidx < needle.length() && hidx < haystack.length() ){
            if( haystack.charAt(hidx) == needle.charAt(nidx) ){
                hidx++;
                nidx++;
                count++;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag && (needle.length() <= haystack.length()) && (needle.length() == count);
    }

}
