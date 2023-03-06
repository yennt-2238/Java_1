package Shape;

public class Circle implements shape{
	private int r;
	

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void getdraw() {
		// TODO Auto-generated method stub
		System.out.println(" please draw circle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI*r*r);
	}

	@Override
	public void displays_infor() {
		System.out.println("Diện tích hình tròn là : "+getArea());
		
	}

	
}
