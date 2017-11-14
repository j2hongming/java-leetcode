package org.j2hongming.leetcode.string.easy;

public class RomanToInt {

	public static void main(String[] args) {

		RomanToInt app = new RomanToInt();
		String s = "DCCCXC";
		System.out.println( app.romanToInt(s) );
	}
	
	public static int romanToInt(String s) {
        int sum = 0;
        char prevChar = 0;
        
        for(int i = s.length()-1 ; i >= 0 ; i-- ){
        	 sum += romanTransform( s.charAt(i), prevChar );
        	 prevChar = s.charAt(i);
        }
        return sum;
    }
	
	public static int romanTransform( char r , char prevChar){
		int result = 0;
        switch(r){
          case 'I':
        	  result = 1;
        	  if( prevChar == 'V' || prevChar == 'X' ){
        		  result = -1;
        	  }
              break;
          case 'V':
        	  result = 5;
              break;
          case 'X':
        	  result = 10;
        	  if( prevChar == 'L' || prevChar == 'C' ){
        		  result = -10;
        	  }
              break;
          case 'L':
        	  result = 50;
              break;
          case 'C':
        	  result = 100;
        	  if( prevChar == 'D' || prevChar == 'M' ){
        		  result = -100;
        	  }
              break;
          case 'D':
        	  result = 500;
        	  break;
          case 'M':
        	  result = 1000;
        	  break;
          default:
        	  break;
        }
        
        return result;
    }

}
