package ch02;

public class OverflowEx {

	public static void main(String[] args) {

		short sMin = -32768;
		short sMax = 32767;
		
		char cMin = 0;
		char cMAx = 65535;
		
		System.out.println("sMin =" + sMin); // sMin =-32768
		System.out.println("sMin-1 =" + (short) (sMin-1)); // sMin-1 =32767 : 최소값 -1 -> 최대값
		System.out.println("sMax = " + sMax); // sMax = 32767
		System.out.println("sMax+1 = " + (short) (sMax+1)); // sMax+1 = -32768 : 최대값 + 1 -> 최소값
		
		System.out.println("cMin =" + (int) cMin); // cMin =0
		System.out.println("cMin-1 =" + (int) --cMin); // cMin-1 =65535
		System.out.println("cMAx =" + (int) cMAx); // cMAx =65535
		System.out.println("cMAx+1 =" + (int) ++cMAx); // cMAx+1 =0
		
	}
}
