package org.j2hongming.leetcode.string.easy;


/**
 * 
 * 1: 1
 * 2: 11
 * 3: 21
 * 4: 1211
 * 5: 111221
 * 6: 312211
 * 7: 13112221
 *
 */
public class CountandSay {

	public static void main(String[] args) {

		System.out.println( countAndSay(7) );
		System.out.println(countAndSayYavinci(7));
	}

	/**
	 * @author  yavinci 
	 * https://discuss.leetcode.com/topic/2264/examples-of-nth-sequence/6
	 */
    public static String countAndSay(int n) {
        if(n <= 0) return "-1";
        String result = "1";
        
        for(int i = 1; i < n; i ++) {
            result = build(result);
        }
        return result;
    }
    
    
    private static String build(String result) {
        StringBuilder builder = new StringBuilder();
        int p = 0;
        while(p < result.length()) {
            char val = result.charAt(p);
            int count = 0;
            
            while(p < result.length() && 
              result.charAt(p) == val){
                p ++;
                count ++;
            }
            builder.append(String.valueOf(count));
            builder.append(val);
        }
        return builder.toString();
    }
    /**
     * @author  yavinci 
     * https://discuss.leetcode.com/topic/14543/straightforward-java-solution
     */
    public static String countAndSayYavinci (int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
            s = countIdx(s);
        }
        return s;
    }
    public static String countIdx(String s){
        StringBuilder sb = new StringBuilder();
        // 設定初始值
        char c = s.charAt(0);
        int count = 1;
        
        for(int cIdx = 1; cIdx < s.length(); cIdx++){
            if(s.charAt(cIdx) == c){
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(c);
                c = s.charAt(cIdx);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
