package org.j2hongming.leetcode.string.easy;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = new AddBinary().addBinary("0", "1");
		System.out.println(result);
		result = new AddBinary().addBinaryElegant("01", "111");
		System.out.println(result);
	}
	
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int zeroNum;
        int plus1;
        int plus2;
        int carry = 0;
        int tmpSum = 0;
        char[] sum = null;
        
        // Complement 0
        if( aLen > bLen ){
            zeroNum = aLen - bLen;
            b = genZero(zeroNum) + b;
            sum = new char[aLen];
        }
        else if( aLen < bLen ){
            zeroNum = bLen - aLen;
            a = genZero(zeroNum) + a;
            sum = new char[bLen];
        }
        else{
        	sum = new char[aLen];
        }
        Arrays.fill(sum, '0');
        
        for( int pos = sum.length-1 ; pos > -1 ; pos-- ){
            plus1 = Character.getNumericValue( a.charAt(pos) );
            plus2 = Character.getNumericValue( b.charAt(pos) );
            tmpSum = plus1 + plus2 + carry;
            switch (tmpSum) {
              case 0:  sum[pos] = '0';
                       carry = 0;
                       break;
              case 1:  sum[pos] = '1';
                       carry = 0;
                       break;
              case 2:  sum[pos] = '0';
                       carry = 1;
                       break;
              case 3:  sum[pos] = '1';
                       carry = 1;
                       break;
              default: break;
            }
        }
        
        return (carry == 1) ? "1" + String.valueOf(sum) : String.valueOf(sum) ;
    }
    
    public String genZero(int zeroNum){
        StringBuffer sb = new StringBuffer("");
        while(zeroNum > 0){
            sb.append("0");
            zeroNum--;
        }
        return sb.toString();
    }

    
    public String addBinaryElegant(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int i =0, carry = 0;
        String res = "";
        while(i<lena || i<lenb || carry!=0){
            int x = (i<lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
            int y = (i<lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
            res = (x + y + carry)%2 + res;
            carry = (x + y + carry)/2;
            i++;
        }
        return res;
    }
    
}
