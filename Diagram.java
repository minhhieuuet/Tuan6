package tuan6;

/**
 * Class Diagram
 * @author Hoang Thai Hoc
 *
 */
public class Diagram {
	private static final int MAX_LAYER = 100;
	private Layer[] layers=new Layer[100];
	private int countLayer;
	
	/**
	 * Constructor
	 */
	public Diagram() {
		layers = new Layer[MAX_LAYER+1];
		countLayer = 0;
	}
	
	/**
	 * Add new layer to diagram     
	 * @param layer new layer to be added
	 */
	public void addLayer(Layer layer) {
		if (countLayer >= MAX_LAYER) {
			return;
		}
		layers[countLayer++] = layer;
	}
	
	/**
	 * Delete all shapes in diagram by shape type
	 * @param type shape type
	 */
	public void deleteShapesByType(int type) {
		for(int i=0; i<countLayer; i++) {
			layers[i].deleteShapesByType(type);
		}
	}
	
	/**
	 * Show diagram's information
	 */
	public void showInfo() {
		for(int i=0; i<countLayer; i++) {
			System.out.println("***************");
			System.out.println("Layer" + i + ":");
			layers[i].showInfo();
		}
	}
}
