package tuan6;

/**
 * Class Rectangle
 * @author Hoang Thai Hoc
 *
 */
public class Rectangle extends Shape {
	private float x, y;
	private float width, height;
	/**
	 * Constructor
	 */
	public Rectangle(float x, float y, float width, float height) {
		super(Shape.RECTANGLE);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
	public void move(int x, int y) {
		// TODO
	}

	
	public float getArea() {
		return this.width * this.height;
	}

	
	public void showInfo() {
		System.out.println("Rectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height);
	}

}
