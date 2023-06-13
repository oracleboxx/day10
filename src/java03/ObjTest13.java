package java03;
/*	
 * 
 */
class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("이름: "+this.name+"\n나이: "+this.age);
	}

}
public class ObjTest13 {

	public static void main(String[] args) {
		Animal animal = new Animal("원숭이", 26);
		animal.show();
		
	}

}

