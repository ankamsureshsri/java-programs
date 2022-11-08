package com.prepinsta.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("manu", "priya", "john");
		for (String s : l) {
			System.out.println(s);
		}
	}

}
