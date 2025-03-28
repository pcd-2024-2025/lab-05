package pcd.lab05.mandelbrot.v4_reactive_concurrent_extended;

public class TaskCompletionLatch {

	private int nWorkers;
	private int nCompletionsNotified;
	
	TaskCompletionLatch(int nWorkers){
		this.nWorkers = nWorkers;
		nCompletionsNotified = 0;
	}
	
	public synchronized void reset() {
		nCompletionsNotified = 0;	
	}
	
	public synchronized void waitCompletion() throws InterruptedException {
		while (nCompletionsNotified < nWorkers) {
			wait();
		}
	}

	public synchronized void notifyCompletion() {
		nCompletionsNotified++;
		notifyAll();
	}
	
}
