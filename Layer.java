package tuan6;

/**
 * Class Layer
 * @author Hoang Thai Hoc
 *
 */
public class Layer {
	private static final int MAX_SHAPE = 100;
	private Shape[] shapes;
	private int countShape;
	
	/**
	 * Layer's constructor
	 */
	public Layer() {
		shapes = new Shape[MAX_SHAPE+1];
		countShape = 0;
	}
	
	/**
	 * This method is used to add new shape to layer
	 * @param shape shape to add
	 */
	public void addShape(Shape shape) {
		if (countShape >= MAX_SHAPE) {
			return;
		}
		shapes[countShape++] = shape;
	}
	
	/**
	 * This method is used to delete a shape in this layer by its index
	 * @param index shape's index
	 */
	private void deleteShape(int index) {
		if (countShape == 0) {
			return;
		}
		for (int i=index; i<countShape; i++) {
			shapes[i] = shapes[i+1];
		}
		countShape--;
	}
	
	/**
	 * Delete all shape by shape type
	 * @param type shape type
	 */
	public void deleteShapesByType(int type) {
		for (int i=countShape-1; i>=0; i--) {
			if (shapes[i].getType() == type) {
				deleteShape(i);
			}
		}
	}
	
	/**
	 * Show layer's information
	 */
	public void showInfo() {
		for (int i=0; i<countShape; i++) {
			shapes[i].showInfo();
		}
	}
}
