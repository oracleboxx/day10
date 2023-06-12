package java03;


/*생성자가 오버로딩이 되면 자바 컴파일로는 매개변수가 없는 기본생성자를 더이상 묵시적으로 
 * 제공하지 않는다
 * 
 */
class Member07{
	private String men_id;
	private String men_pwd;
	private String men_name;
	
	public Member07(String men_id, String men_pwd, String men_name) {
		this.men_id = men_id;
		this.men_pwd = men_pwd;
		this.men_name = men_name;
	}
	public void print() {
		System.out.println(men_id+":"+men_pwd+":"+men_name);
	}
}
public class ObjTest04{

	public static void main(String[] args) {
		Member07 member = new Member07("id","pwd","name");
		member.print();
	
	
	}

}
