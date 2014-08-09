package com.codequ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static String readString(String message) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print(message);
			String input = br.readLine();
			return input;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static int readInt(String message) {
		return Integer.parseInt(readString(message));
	}
	
	public static double readDouble(String message) {
		return Double.parseDouble(readString(message));
	}
	
	public static boolean readBoolean(String message){
		return Boolean.parseBoolean(readString(message));
	}
	
}
