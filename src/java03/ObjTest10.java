package java03;
/* 1. static으로 정의된 정적변수와 인스턴스 변수 차이점 
 * 2.{} 인스턴스 변수 초기화 블록 
 * 
 */
class Product13 {
	static int count = 0; // 정적변수
	 int serialNumber ;   //  인스턴스 변수
	{
		++count;
		serialNumber = count;
		//인스턴스 변수는 각 객체마다 주소가 달라서 다른 값을 저장한다.
		// 객체마다 따로 관리한다.
	}
}
public class ObjTest10 {

	public static void main(String[] args) {
		Product13  p01 = new Product13(); 
		Product13  p02 = new Product13();
		Product13  p03 = new Product13();
		System.out.println("p01 제품번호(시리얼 번호)="+p01.serialNumber);
		System.out.println("p02 제품번호(시리얼 번호)="+p02.serialNumber);
		System.out.println("p03 제품번호(시리얼 번호)="+p03.serialNumber);
		System.out.println("총 생상된 제품 개수:"+Product13.count);
		// 객체 생성될 때 마다 인스턴스 초기화 블록을 생성자 보다 먼저 호출
	}

}
