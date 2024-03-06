package t2_array;

public class Test10 {
	public static void main(String[] args) {
		
		// 2차원 배열
		/*  4  3  2  1
		 *  8  7  6  5
		 *  12 11 10 9
		 */
		
		int[][] atom = new int[3][4]; // []가 차원의 갯수
		
		// 값 기억시키기
		int cnt = 5;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				cnt--;
				atom[i][j] = cnt;
			}
			cnt += 8;
		}
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
