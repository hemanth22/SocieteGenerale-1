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
				checkDigits(i, sb);
				if(sb.length() == 0){
					System.out.println(i);
				}else{
					System.out.println(sb.toString());
				}
			}
			sb.delete(0, sb.length());
		}
	}

	private void checkDigits(Integer i, StringBuilder sb){
		if (i != 0 && sb == null) {
			sb = new StringBuilder();
		}

		String str = i.toString();
		for(int j = 0; j< str.length(); j++){
			int key = Integer.parseInt(Character.toString(str.charAt(j)));
			if (map.containsKey(key)) {
				sb.append(map.get(key));
			}
		}
	}
}
