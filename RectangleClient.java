
public class RectangleClient {
	public static void main (String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.x = 1;
		rect1.y = 2;
		rect1.height = 10;
		rect1.width = 20;
		
		System.out.println("Rectangle 1 coordinate: (" + rect1.x + "," + rect1.y + ")\nArea of Rectangle 1: " + rect1.getArea());
		
		Rectangle rect2 = new Rectangle();
		rect2.x = 3;
		rect2.y = 4;
		rect2.height = 30;
		rect2.width = 40;
		
		System.out.println("Rectangle 2 coordinate: (" + rect2.x + "," + rect2.y + ")\nArea of Rectangle 2: " + rect2.getArea());
		
	}
}
