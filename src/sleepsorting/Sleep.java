package sleepsorting;
/*
 * sleep sort
 * �迭�� �� �ε����� �ش� ��ġ�� ������ ����ŭ Sleep�� �ְ�
 * �迭�� ��ȸ�ϸ� �� ���Ҵ� (milliseconds * 1000 * ������ ��) �� �ð��� ���� �Ŀ� �����
 * �ڱ� �ڽ��� ��ġ�� �Ѵ�.
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
						//������ ��*second��ŭ sleep �� ���
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