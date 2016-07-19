package com.sg;

import java.util.HashMap;

import com.sg.exception.InvalidRangeException;

public class PrintNumber {

	private HashMap<Integer, String> map = null;

	public PrintNumber() {
		map = new HashMap<Integer, String>();
		map.put(3, "Foo");
		map.put(5, "Bar");
		map.put(7, "Qix");
	}

	public void print(int start, int end) {
		if(start > end){
			throw new InvalidRangeException("Range is invalid.");
		}
		StringBuilder sb = new StringBuilder();

		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

				if (i % 3 == 0) {
					sb.append(map.get(3));
				}

				if (i % 5 == 0) {
					sb.append(map.get(5));
				}

				if (i % 7 == 0) {
					sb.append(map.get(7));
				}

				checkDigits(i, sb);
				System.out.println(sb.toString());
			} else {
				System.out.println(i);
			}
			sb.delete(0, sb.length());
		}
	}

	private void checkDigits(int i, StringBuilder sb) {
		if (i > 0 && sb == null) {
			sb = new StringBuilder();
		}

		int d = 0;
		while (i > 0) {
			d = i % 10;
			i = i / 10;
			if (map.containsKey(d)) {
				sb.append(map.get(d));
			}
		}
	}
}
