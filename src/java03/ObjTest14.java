package java03;
class Product{
	String name = "물";
	int price = 800;
	public Product(String name, int price) {
	
		this.name = name;
		this.price = price;
	}
	public Product(String name) {
		this.name = name;
	}
	public Product(int price) {
		this.price = price;
	}
	public Product() {
		
	}
	
	
//	public void shows() {
//		System.out.print(name+","+price+"\n");
//	}
//	
}
public class ObjTest14 {

	public static void main(String[] args) {
		Product pro = new Product("웰치스", 700);
		Product pro1 = new Product("커피");
		Product pro2 = new Product(500);
		Product pro3 = new Product();
		
		System.out.println(pro.name+","+pro.price);
		System.out.println(pro1.name+","+pro1.price);
		System.out.println(pro2.name+","+pro2.price);
		
	}

}
