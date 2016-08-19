package com.encryptionproject.explorer;

public class Utils
{
	
	
	public static String decrypt(String enc, int offset) 
	{
		return encrypt(enc, 26-offset);
	}

	public static String encrypt(String enc, int offset) {
		offset = offset % 26 + 26;
		StringBuilder encrypted = new StringBuilder();

		for (char i : enc.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encrypted.append((char) ('A' + (i - 'A' + offset) % 26 ));
				} else {
					encrypted.append((char) ('a' + (i - 'a' + offset) % 26 ));
				}
			} else {
				encrypted.append(i);
			}
		}
		return encrypted.toString().toUpperCase();
	}//encrypt
}//class
