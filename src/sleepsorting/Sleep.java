package sleepsorting;
/*
 * sleep sort
 * 배열의 각 인덱스에 해당 위치의 원소의 값만큼 Sleep를 주고
 * 배열을 순회하며 각 원소는 (milliseconds * 1000 * 원소의 값) 의 시간이 지난 후에 깨어나며
 * 자기 자신을 외치게 한다.
 * 
 */
import java.util.concurrent.CountDownLatch;
 
public class Sleep {
	public static void sleepSortAndPrint(int[] nums) {
		final CountDownLatch doneSignal = new CountDownLatch(nums.length);
		for (final int num : nums) {
			new Thread(new Runnable() {
				public void run() {
					doneSignal.countDown();
					try {
						doneSignal.await();
 
						//using straight milliseconds produces unpredictable
						//results with small numbers
						//using 1000 here gives a nifty demonstration
						Thread.sleep(num*1000);
						//원소의 값*second만큼 sleep 후 출력
						System.out.println(num);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
	public static void main(String[] args) {
		int nums[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		sleepSortAndPrint(nums);
	}
}