package pcd.lab05.chrono.v1;

public class Flag {

	private boolean flag;
	
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
