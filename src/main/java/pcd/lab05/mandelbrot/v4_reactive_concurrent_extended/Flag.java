package pcd.lab05.mandelbrot.v4_reactive_concurrent_extended;

public class Flag {

	private boolean flag;
	
	public Flag() {
		flag = false;
	}
	
	public synchronized void reset() {
		flag = false;
	}
	
	public synchronized void set() {
		flag = true;
	}
	
	public synchronized boolean isSet() {
		return flag;
	}
}
