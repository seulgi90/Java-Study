package ch05;

import java.util.Arrays;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		System.out.println("매겨변수의 개수: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+ i +"] = \"" + args[i] + "\"");
		}
	}
	
	// 커맨드 라인 입력받기 run -> run configuration -> arguments 
	
}
