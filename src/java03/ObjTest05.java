package java03;
/*this 키워드를 사용해야 하는 이유
 * 클래스 소속의 멤버변수 중 인스턴스 변수(속성)와 메서드(생성자) 
 * 소속의 매개변수(전달인자) 이름이 같은 경우 인스턴스 변수명
 * 앞에 this.을 사용하지 않으면 자바는 어느 것이 인스턴스 변수인지, 
 * 전달이자인 구분을 못해서 값을 저장 못한다.
 */
class MyDate08{
	private int year;
	private int month;
	private int day;
	
	public MyDate08() {
		
	}
	public MyDate08(int year , int month , int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void pr() {
		System.out.println(year+":"+month+":"+day);
	}
}
public class ObjTest05 {

	public static void main(String[] args) {
		MyDate08 date = new MyDate08(2023,6,12);
		date.pr();
	}

}
