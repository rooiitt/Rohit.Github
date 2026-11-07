package com.kodewala.buffer1;

public class QueBuffer10 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer result = sb.append("8");

		System.out.println(sb == result);
		System.out.println(sb.equals(result));

	}

}
