
public class Rectangle {
	int x;
	int y;
	int height;
	int width;
	
	public void setField(int newx, int newy, int newwidth, int newheight){
		x = newx;
		y = newy;
		width = newwidth;
		height = newheight;
		
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getArea(){
		return width * height;
	}
}
