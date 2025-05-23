package pcd.lab05.mandelbrot.v1_not_reactive;

/**
 * Mandelbrot Viewer - sequential and non responsive version.
 * 
 * suggested  starting points: 
 * (0,0) diam 4
 * (-0.75,0.1) diam 0.04
 * (-0.75,0.1) diam 0.4
 * (-0.7485,0.0505) diam 0.000004;
 *		 
 * @author aricci
 *
 */
public class MandelbrotViewer {
	public static void main(String[] args) {
		
		int w = 800;
		int h = 600;
		int nIter = 5000;
		
		var set = new MandelbrotSet(w, h, nIter);
		var view = new MandelbrotView(w, h);
		var controller = new Controller(set, view);
		view.addListener(controller);
		view.display();
	}

}
