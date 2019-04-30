package com.coderslab;

import org.junit.Test;

public class SpreedSheetColumnGenerate {

	private String[] columns = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	private int INTERVAL = 0;
	private int MAX_INTERVAL = 5;
	private String PREFIX = "";

	@Test
	public void test() {
		for (int i = 0; i < columns.length; i++) {
			if (i == 0) INTERVAL++;
			if (INTERVAL > MAX_INTERVAL) break;
			if (INTERVAL > 1 && i == 0) PREFIX = columns[INTERVAL - 1];
			System.out.println(PREFIX + columns[i]);
			if (i == columns.length - 1) i = -1;
		}
	}
}
