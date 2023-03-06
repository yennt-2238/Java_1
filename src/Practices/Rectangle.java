package Practices;

public class Rectangle extends Shape {
	float canh2;
	
	
	public Rectangle(int canh1, int canh2) {
		super(canh1);
		this.canh2=canh2;
	}

	public void getArea() {
		System.out.println("Area"+canh2 * getcanh1t());
	}
	
	public void perimater() {
		System.out.println("Ảea"+ 2*(getcanh1t() * canh2));
	}

}
