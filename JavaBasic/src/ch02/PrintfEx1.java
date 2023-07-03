package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10;
		int binNum = 0b10; // 2신수 10, 10진수로는 2
		
		// printf()는 출력 후 줄바꿈을 하지 않는다 -> %n 줄바꿈을 넣어줘야한다
		System.out.printf("b=%d%n", b); //	b=1
		System.out.printf("s=%d%n", s); //	s=2
		System.out.printf("c=%c, %d %n", c, (int)c); //	c=A, 65 
		System.out.printf("finger=[%5d]%n", finger); //	finger=[   10] 5자리 채우기 (공백 앞으로)
		System.out.printf("finger=[%-5d]%n", finger); // finger=[10   ] 5자리 채우기 (공백 뒤로)
		System.out.printf("finger=[%05d]%n", finger); // finger=[00010] 5자리 채우기 (0으로 공백 채우기)
		System.out.printf("big=%d%n", big); //	big=100000000000
		System.out.printf("hex=%#x%n", hex); //	hex=0xffffffffffffffff ( '#'은 접두사)
		System.out.printf("octNum=%o, %d%n", octNum, octNum); // octNum=10, 8
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // hexNum=10, 16
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // binNum=10, 2
		
		// %b : boolean 형식  출력
		// %d : 10진수 형식 출력
		// %c : 문자(character)로 출력 <->  %s : 문자열(string)로 출력
		// %o : 8진수
		// %x : 16진수
		
		System.out.printf("finger=[%3d]%n", finger); //	finger=[ 10]
		System.out.printf("finger=[%-3d]%n", finger); // finger=[10 ]
		System.out.printf("finger=[%03d]%n", finger); // finger=[010]
	}
}
