package com.prodapt.array;

import java.util.*;

class StringTokenzier1 {

	public static void main(String[] args) {

		StringTokenizer obj = new StringTokenizer("welcome to prodapt family", " ");

		while (obj.hasMoreTokens()) {
			System.out.println(obj.nextToken());
			System.out.println("the element is : " + obj.nextElement());
		}
		int count = obj.countTokens();
		System.out.println("no of token:" + count);
	}
}
