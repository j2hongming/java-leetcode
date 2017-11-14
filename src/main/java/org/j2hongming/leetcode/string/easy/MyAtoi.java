package org.j2hongming.leetcode.string.easy;

public class MyAtoi {

	public static void main(String[] args) {

		MyAtoi app = new MyAtoi();
		System.out.println(app.otherAtoi(""));
		System.out.println(app.otherAtoi("976"));
		System.out.println(app.otherAtoi("1234567876"));
		System.out.println(app.otherAtoi("+"));
		System.out.println(app.otherAtoi("+1"));
		System.out.println(app.otherAtoi("-1"));
		System.out.println(app.otherAtoi("    00010"));
		System.out.println(app.otherAtoi("  -0012a42"));
		
	}

	public static int myAtoi(String str) {
		str = str.trim();
		int result = 0;
		if (str.matches("(\\+|-)?\\d+")) {
			for (int i = 0; i < str.length(); i++) {
				// check if char is digit

				if (str.charAt(i) == '+' || str.charAt(i) == '-' || (i==0 && str.charAt(i) == '0') )
					continue;
				result = result + (Character.getNumericValue(str.charAt(i)) * genMulti(str.length() - i - 1));

			}
		} 
		else {
			result = 0;
		}

		return ( str != null && !str.isEmpty() && str.charAt(0) == '-') ? (-1) * result : result;
	}

	public static int genMulti(int n) {
		int result = 1;
		while (n > 0) {
			result *= 10;
			n--;
		}
		return result;
	}
	
	public static int otherAtoi(String str) {
		if (str == null || str.length() == 0)
			return 0;
		str = str.trim();
		char firstChar = str.charAt(0);
		int sign = 1, start = 0, len = str.length();
		long sum = 0;
		if (firstChar == '+') {
			sign = 1;
			start++;
		} else if (firstChar == '-') {
			sign = -1;
			start++;
		}
		for (int i = start; i < len; i++) {
			if (!Character.isDigit(str.charAt(i)))
				return (int) sum * sign;
			sum = sum * 10 + str.charAt(i) - '0';
			if (sign == 1 && sum > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}

		return (int) sum * sign;
	}
}
