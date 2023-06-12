package java03;
/* 생성자는 메서드의 일종이기  떄문에 생성자 오버로딩이 가능하다.
 * 
 * 
 */
class MyDate05{
	private int year;
	private int month;
	private int day;
	
	public void MyDate05(int year , int month){
		this.year = 2023;
		this.month = 6;
		System.out.println(year+":"+month);
		
	}
	public void MyDate05(int year , int month , int day) {
		this.year = year;
		
		this.month = month;
		this.day = day;
		System.out.println(year+":"+month+":"+day);
	}
	public void pr(int year , int month , int day) {
		System.out.println(year+"년"+month+"월"+day+"일");
	}
	
}

public class ObjTest02 {

	public static void main(String[] args) {
		MyDate05 date =new MyDate05();
		
		date.MyDate05(2023, 6);
		date.MyDate05(2023, 7, 23);
	}

}
