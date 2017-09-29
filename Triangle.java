package tuan6;

/**
 * Class Triangle
 * @author Hoang Thai Hoc
 *
 */
public class Triangle extends Shape {
	private float x1, y1, x2, y2, x3, y3;
	
	public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
		super(Shape.TRIANGLE);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	@Override
	public void move(int x, int y) {
		// TODO
	}

	@Override
	public float getArea() {
		float area = (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2;
		return area > 0 ? area : (0 - area);
	}

	@Override
	public void showInfo() {
		System.out.println("Triangle: x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2="+ y2 + ", x3=" + x3 + ", y3=" + y3);
	}
}
