package tuan6;

/**
 * Class Circle
 * @author Hoang Thai Hoc
 *
 */
public class Circle extends Shape {
	private float xR, yR, R;
	
	public Circle(float xR, float yR, float R) {
		super(Shape.CIRCLE);
		this.xR = xR;
		this.yR = yR;
		this.R = R;
	}

	@Override
	public void move(int x, int y) {
		// TODO
	}

	@Override
	public float getArea() {
		return (float) Math.PI * this.R * this.R;
	}

	@Override
	public void showInfo() {
		System.out.println("Circle: xR=" + xR + ", yR=" + yR + ", R=" + R);
	}

}
