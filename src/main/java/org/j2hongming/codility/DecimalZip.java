package org.j2hongming.codility;

public class DecimalZip {

	public static void main(String[] args) {

		DecimalZip app = new DecimalZip();
		System.out.println(app.solution(12, 56));
		System.out.println(app.solution(56, 12));
		System.out.println(app.solution(12345, 678));
		System.out.println(app.solution(123, 67890));
		System.out.println(app.solution(1234, 0));
		System.out.println(app.solution(67890, 684920));
	}

	public static int solution(int A, int B) {
		// write your code in Java SE 8
		StringBuilder sb = new StringBuilder();
		String aStr = Integer.toString(A);
		String bStr = Integer.toString(B);
		int diff = 0, basic = 0, i = 0, j = 0;

		diff = aStr.length() - bStr.length();
		basic = (diff > 0) ? bStr.length() : aStr.length() ;
		for (i = 0; i < basic; i++) {
			sb.append(aStr.charAt(i));
			sb.append(bStr.charAt(i));
		}
//		A is longer
		if (diff > 0) {
			for(j = i ; j < aStr.length(); j++){
				sb.append(aStr.charAt(j));
			}
		}
//		B is longer
		else{
			for(j = i ; j < bStr.length(); j++){
				sb.append(bStr.charAt(j));
			}
		}

		return (sb.toString().length() < 9) ? Integer.parseInt( sb.toString() ) : -1;
	}
}
