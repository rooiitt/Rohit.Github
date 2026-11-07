package com.kodewala.buffer1;

public class QueBuffer3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java"); //two string will be store in result object
		StringBuffer ref = sb;

		sb.append(" Programming");

		System.out.println(sb);
		System.out.println(ref);
		

	}

}
