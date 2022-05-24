package practice;

public class ThreadSample implements Runnable{
	int num;
	ThreadSample(int num) {
		this.num = num;
	}
	
	public void run() {
		for (int j = 1; j <= 3; j++) {
			try {
				Thread.sleep(1000);
				System.out.println("ThreadSample" + num + "のスレッド：" + j + "回目");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
