package practice;

public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			ThreadSample threadSample = new ThreadSample(i);
			Thread thread = new Thread(threadSample);
			thread.start();
			
		}
		
		for (int j = 1; j <= 3; j++) {
			try {
				Thread.sleep(1000);
				System.out.println("Chapter15_4のスレッド：" + j + "回目");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
