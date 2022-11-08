package com.prepinsta.collections;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s = "ankam suresh";
		String s1 = "";
		s1 = s.replaceAll("\\s", "");
		System.out.println(s1);

	}

}
