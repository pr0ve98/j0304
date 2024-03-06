package t2_array;

public class Test11_3 {
	public static void main(String[] args) {
		
		// 2차원 배열(불규칙값 저장)
		/*  100  90  80  50
		 *  80   50  
		 *  90   10  20  90
		 *  100  10  20  
		 */
		
		int[][] atom = 
			{
				{100,90,80,50},
				{80,50},
				{90,10,20,90},
				{100,10,20}
			};
		
		// 배열에 저장된 형태 그대로 출력하기
		for(int i=0; i<atom.length; i++) { // 행의 크기는 배열명.length
			for(int j=0; j<atom[i].length; j++) { // 열의 크기는 행이름.length
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
