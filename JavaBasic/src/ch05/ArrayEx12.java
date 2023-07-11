package ch05;

import java.util.Arrays;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		String[] names = {"Kim", "Park", "Yi"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"]:"+ names[i]);
//			names[0]:Kim
//			names[1]:Park
//			names[2]:Yi
		}
		String tmp = names[2];
		System.out.println("tmp:" + tmp); // tmp:Yi
		names[0] = "Yu";
		
		for (String str : names) {
			System.out.println(str);
//			Yu
//			Park
//			Yi
		}
	}
	
}
