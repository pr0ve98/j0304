package t3_exam;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		
		// 최대, 최소값 구하기(2자리 이하의 정수가 입력된다.)

		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt=0;
		int[] arr = new int[200]; // 배열의 단점: 사용하지 않는 것도 선언해야 함.
		
		while(true) {
			System.out.print("정수를 입력하세요.(종료:999) ");
			su = sc.nextInt();
			if(su == 999) break;
			
			arr[cnt] = su;
			cnt++;
			
			if(su > max) max = su;
			if(su < min) min = su;
		}
		// 입력받은 수를 차례대로 출력하시오.
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i]+" / ");
		}
		System.out.println();
		System.out.println("최대값 : "+max+", 최소값 : "+min);
		
		sc.close();
		
	}
}
