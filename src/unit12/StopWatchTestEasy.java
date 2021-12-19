package unit12;

public class StopWatchTestEasy {
	public static void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void main(String[] args) {
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		StopWatch stopWatch = new StopWatch();
		sort(array);
		stopWatch.stop();
		System.out.printf("[%d...%d]\n", array[0], array[99999]);
		System.out.println(stopWatch.getElapsedTime());
	}
}
