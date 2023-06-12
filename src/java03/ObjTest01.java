package java03;
/*	생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화 기능이다
 * 
 */
class Member04{
	private String member_id;
	private String member_name;
	private String member_phone;
	public Member04() { // 전달인자가 없는 기본생성자
		this.member_id = "abcd";
		this.member_name = "길동";
		this.member_phone = "010-1111-2222";
	}
	public void pr() {
		System.out.println("아이디: "+member_id+
				"\n회원이름: "+member_name+
				"\n회원 번호 : "+member_phone);
	}
}
public class ObjTest01 {

	public static void main(String[] args) {
		Member04 m = new Member04();
		m.pr();
	}

}
