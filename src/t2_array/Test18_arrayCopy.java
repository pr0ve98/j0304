package t2_array;

public class Test18_arrayCopy {
	public static void main(String[] args) {
		
		// 배열 복사 : System.arrayCopy(원본배열명, 원본배열시작인덱스,타겟배열명, 타겟배열시작인덱스, 복사할횟수)
		
		int[] su1 = {1,3,5,7,9};
		int[] su2 = new int[su1.length]; // su1과 인덱스가 같아야 복사받을 수 있다
		
		// 배열복사(System.arrayCopy())
		System.arraycopy(su1, 0, su2, 0, su1.length); // 깊은 복사
		
		System.out.print("su1 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " / ");
		}
		System.out.println();
		
		System.out.print("su2 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su2[i] + " / ");
		}
		System.out.println();
		System.out.println("=====================");
		
		su2[3] = 500;
		
		System.out.print("su1 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " / ");
		}
		System.out.println();
		
		System.out.print("su2 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su2[i] + " / ");
		}
		
	}
}
