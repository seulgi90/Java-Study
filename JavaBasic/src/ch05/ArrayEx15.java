package ch05;

import java.util.Arrays;

public class ArrayEx15 {

	public static void main(String[] args) {
		
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-", "-..", ".", "..-.", "--.", "....", "..", ".----",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		String result= "";
		
		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];
		}
		System.out.println("source: " + source); // source: SOSHELP
		System.out.println("morse: " + result); // morse: ...---.........-...--.
	}
	
}
