package com.coderslab;

import org.junit.Test;

public class SpreedSheetColumnGenerate {

	private String[] columns = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	@Test
	public void test() {
		int interval = 2;
		for(int i = 0; i < columns.length; i++) {
			System.out.println(columns[i]);
		}
	}
}
