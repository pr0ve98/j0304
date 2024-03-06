package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		// ctrl + shift + o: 임포트 단축키

		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속 할까요?(Y/N): ");
		yn = sc.next();
		System.out.println("입력된 문자 : " +yn);
		
		for(int i=0; i<yn.length(); i++) {
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y입니다.");
			// 문자열은 .equals 로 비교 가능
			else System.out.println("입력된 문자는 Y가 아닙니다.");
		}
		
		sc.close();
	}
}