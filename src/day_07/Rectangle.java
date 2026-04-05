package day_07;

public class Rectangle {
	int length;
	int width;
	public Rectangle(int len, int wid) {
		this.length = len;
		this.width = wid;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	//methods for the area and perimeters
	public int calculateArea() {
		return length * width;
	}
	//
	public int calculatePerimeter() {
		return 2*(length + width);
	}
	
	
}
