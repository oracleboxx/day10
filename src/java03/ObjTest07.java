package java03;
/*  this()의 기능
 * 	같은 클래스 네에서 오버로딩 된 다른생성자를 호출할 때 사용한다.
 *  
 */
class MyDate10{
	private int year;
	private int month;
	private int day;
	public MyDate10() { // 전달인자가 없는 생성자
		this(2023,2,1); // 같은 클래스 내에서 다른 생성자를 호출
	}
	
	public MyDate10(int year, int month, int day) { // 생성자 오버로딩
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	public MyDate10(int year, int month) {
		this(year,month,10);
	}
	public void pr() {
		System.out.println(year+":"+month+":"+day);
	}
	
}

public class ObjTest07 {

	public static void main(String[] args) {
		MyDate10 date = new MyDate10(2023,6,12);
		MyDate10 date2 = new MyDate10(2023,7);
		MyDate10 date3 = new MyDate10();
		
		date.pr();
		date2.pr();
		date3.pr();
	}

}
