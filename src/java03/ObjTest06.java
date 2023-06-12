package java03;
/*  클래스 소속의 인스턴스 변수명과 메서드 소속의 전달인자 명이 같을 때는 인스턴스
 *  변수명 앞에 this.을 붙여서 구분해야 값이 저장된다
 * 
 */
class GuestBook09{
	private String writer;
	private String title;
	private String content;
	
	public GuestBook09() {
		
	}
public GuestBook09(String writer , String title , String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

public void setTitle(String title) {
	this.title = title;
}
 public void GuestBookprint() {
	 System.out.println(writer+":"+title+":"+content);
 }

}
public class ObjTest06 {

	public static void main(String[] args) {
		GuestBook09 guest = new GuestBook09("asd","제목","내용");
		guest.GuestBookprint();
		guest.setTitle("new 제목"); // GuestBook09에서 Title 내용 변경
		guest.GuestBookprint();
	}

}
