package ex97;

public abstract  class Shape {
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	private String color;	
	private int borderwidth;
	
	public void area() {
		
	}
}
