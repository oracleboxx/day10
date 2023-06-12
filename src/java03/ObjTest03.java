package java03;

/* 자바에서 생성자가 오버로딩이 되면 전달인자가 없는 기본생성자를 자바 컴파일러가 묵시적 제공을 하지않는다
 * 생성자가 오버로딩이 안되면 기본생성자를 묵시적 제공
 * 
 * 
 */
class Board06{
	private String board_Name;// 글쓴이
	private String board_Title; // 글제목
	private String board_Content; // 글내용
	
	public String getBoard_Name() {
		return board_Name;
	}

	public void setBoard_Name(String board_Name) {
		this.board_Name = board_Name;
	}

	public String getBoard_Title() {
		return board_Title;
	}

	public void setBoard_Title(String board_Title) {
		this.board_Title = board_Title;
	}

	public String getBoard_Content() {
		return board_Content;
	}

	public void setBoard_Content(String board_Content) {
		this.board_Content = board_Content;
	}

	public void board_print() {
	System.out.println(this.getBoard_Name());
	System.out.println(this.getBoard_Title());
	System.out.println(this.getBoard_Content());
	
		
	}
}

public class ObjTest03 {

	public static void main(String[] args) {
		Board06 board = new Board06();
	 board.setBoard_Name("홍길동");
	 board.setBoard_Title("게시판 제목");
	 board.setBoard_Content("게시판 내용");
	 board.board_print();
	 
	}

}
