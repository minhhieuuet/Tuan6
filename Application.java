package tuan6;

/**
 * Main class
 * @author Hoang Thai Hoc
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Diagram d = new Diagram();
		
		System.out.println("Add two layers with their shapes into diagram:");
		Layer l0 = new Layer();
		Layer l1 = new Layer();
		d.addLayer(l0);
		d.addLayer(l1);
		
		l0.addShape(new Triangle(0, 0, 1, 1, 2, 2));
		l0.addShape(new Circle(0, 0, 5));
		l0.addShape(new Circle(1, 0, 3));
		l0.addShape(new Triangle(1, 0, 3, 1, 4, 2));
		l1.addShape(new Square(5, 5, 5));
		l1.addShape(new Circle(3, 3, 3));
		l1.addShape(new Triangle(1, 1, 3, 3, 4, 4));
		
		d.showInfo();
		
		System.out.println("\n\n");
		System.out.println("Delete all triangles of layer l0:");
		l0.deleteShapesByType(Shape.TRIANGLE);
		d.showInfo();
		
		System.out.println("\n\n");
		System.out.println("Delete all circles of diagram:");
		d.deleteShapesByType(Shape.CIRCLE);
		d.showInfo();
	}

}
