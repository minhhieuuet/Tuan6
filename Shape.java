package tuan6;

/**
 * Class Shape
 * @author Hoang Thai Hoc
 *
 */
public abstract class Shape {
	public static int RECTANGLE = 1;
	public static int SQUARE = 2;
	public static int TRIANGLE = 3;
	public static int CIRCLE = 4;
	
	private int type;
	private String color;
	
	/**
	 * Constructor
	 * Need to declared shape's type
	 * @param type shape's type
	 */
	public Shape(int type) {
		this.type = type;
		this.color = "white";
	}
	
	/**
	 * This method is used to set color of a shape
	 * @param color new color to be set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * This method is used to get type of a shape
	 * @return shape's type
	 */
	public int getType() {
		return this.type;
	}
	
	/**
	 * This method is used to get color of a shape
	 * @return shape's color
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * This method is used to move a shape to new position
	 * (Need to be implemented in subclass) 
	 * @param x x coordinates
	 * @param y y coordinates
	 */
	public abstract void move(int x, int y);
	
	/**
	 * This method is used to get area of a shape
	 * (Need to be implemented in subclass) 
	 * @return shape's area
	 */
	public abstract float getArea();
	
	/**
	 * Show shape's information
	 */
	public abstract void showInfo();
}
