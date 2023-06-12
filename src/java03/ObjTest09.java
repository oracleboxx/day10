package java03;

	


public class ObjTest09 {
	static int[] arr = new int[10]; // 배열 크기가 10인 정적배열 arr
	
	static { // 클래스 초기화 블록에서 정적변수 arr초기화
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] =(int)(Math.random()*10+1); 
		}   // random() 메서드는 0.0 이상 1.0미만 사이의 실수 숫자 난수를 발생
	}
	public static void main(String[] args) {
 
			for(int k : arr) {
				System.out.print(" "+k);
			}
	}

}
