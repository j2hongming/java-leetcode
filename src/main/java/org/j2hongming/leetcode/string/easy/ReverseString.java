package org.j2hongming.leetcode.string.easy;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseString("hello"));
		System.out.println(reverseStringTwoPoint("hello"));
		
		System.out.println(reverseString("leetcode"));
		System.out.println(reverseStringTwoPoint("leetcode"));
	}

	public static String reverseString(String s) {

		char[] chars = s.toCharArray();
		Stack<String> rev = new Stack<String>();

		for (char c : chars) {
			rev.push(c + "");
		}

		for (int i = 0; i < chars.length; i++) {
			chars[i] = rev.pop().charAt(0);
		}
		return new String(chars);
	}

	public static String reverseStringTwoPoint(String s) {
		if (s == null || s.length() == 0)
			return s;
		char[] chars = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {

			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			start++;
			end--;
		}
		return new String(chars);
	}
}
