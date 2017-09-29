package tuan6;

/**
 * Class Square
 * @author Hoang Thai Hoc
 *
 */
public class Square extends Shape {
	private float x, y;
	private float width;
	/**
	 * Constructor
	 */
	public Square(float x, float y, float width) {
		super(Shape.SQUARE);
		this.x = x;
		this.y = y;
		this.width = width;
	}

	@Override
	public void move(int x, int y) {
		// TODO
	}

	@Override
	public float getArea() {
		return this.width * this.width;
	}

	@Override
	public void showInfo() {
		System.out.println("Square: x=" + x + ", y=" + y + ", width=" + width);
	}

}
