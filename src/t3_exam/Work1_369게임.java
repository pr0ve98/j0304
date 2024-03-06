package t3_exam;

public class Work1_369게임 {
	public static void main(String[] args) {

		/*
		  1~100까지의 수를 차례로 출력하되 3,6,9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오. 
		  한줄에 10개씩 출력하시오. ex) 1 2 짝 4 5 짝 7 ~~~~~ 29 짝 짝 짝 짝짝(33) 짝
		*/
		
		// 배열을 이용한 369 게임
		
		String[] num = new String[100];
		int sw;
		String temp;
		
		//Integer.toString() 괄호 안을 감싸 변환 / 래퍼클래스
		
		// num[] 배열에 3,6,9 대신에 '짝' 문자열을 저장
		for(int i=0; i<num.length; i++) {
			num[i] = (i+1) + ""; // 문자와 숫자 결합이어서 문자가 됨 (문자로 변환)
			temp = ""; // 누적을 위해 초기값 설정
			sw = 0;
			
			for(int j=0; j<num[i].length(); j++) { // 3,6,9가 하나라도 들어가면 if 문 진입
				if(num[i].charAt(j) == '3' || num[i].charAt(j) == '6' || num[i].charAt(j) == '9') {
					temp += "짝";
					sw = 1;
				}
			}
			if(sw == 1) num[i] = temp;
			
		}
		// num[]배열에 저장된 값을 10개씩 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
			if((i+1) % 10 == 0) System.out.println();
		}
	
	}
}
