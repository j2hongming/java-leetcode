package org.j2hongming.leetcode.string.easy;


/**
 * @author  benjamin19890721
 * @see https://discuss.leetcode.com/topic/12430/java-solution-with-fewer-if-logic
 */
public class CompareVersionNumbers {

	public static void main(String[] args) {

		String v1 = "0.1";
		String v2 = "1.2";
		String v3 = "1.2";
		String v4 = "2.5";
		System.out.println( compareVersion(v1, v2) );
		System.out.println( compareVersion(v2, v1) );
		System.out.println( compareVersion(v2, v3) );
		System.out.println( compareVersion(v4, v1) );
	}

    public static int compareVersion(String version1, String version2) {
        
        // based on the ".", split to parts
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int length = Math.max(v1.length, v2.length);
        
        // compare for parts
        for( int part = 0 ; part < length; part++ ){
            int num1 = (part < v1.length) ? Integer.parseInt( v1[part] ) : 0;
            int num2 = (part < v2.length) ? Integer.parseInt( v2[part] ) : 0;
            
            // Compare
            if ( num1 < num2 ) {
                return -1;
            }
            else if ( num1 > num2 ) {
                return 1;
            }
        }
        
        // All part equals
        return 0;
    }
}
