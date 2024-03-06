package t2_array;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = {'k','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray);
		// char 타입은 문자이기 때문에 char타입의 결합은 문자열이 된다(String과 같음)
	}
}
