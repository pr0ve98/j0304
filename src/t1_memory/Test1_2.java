package t1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; // 1:계속, 0:그만
		int cnt = 0;
		String ans = "N";

		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(Y:계속, N:그만): ");
			ans = sc.next();
			if(ans=="N") break; //객체는 비교가 불가 = 끝나지 않음
		}
		System.out.println("작업 끝!");
		
		sc.close();
	}
}
