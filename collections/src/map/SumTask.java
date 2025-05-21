package map;

import java.util.concurrent.ConcurrentHashMap;

public class SumTask implements Runnable {

    private int[] numbers;
    private int startIndex;
    private int endIndex;
    private ConcurrentHashMap<String, Integer> resultMap;

    public SumTask(int[] numbers, int startIndex, int endIndex, ConcurrentHashMap<String, Integer> resultMap) {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.resultMap = resultMap;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
        }
        // Lưu kết quả vào ConcurrentHashMap
        resultMap.put(Thread.currentThread().getName(), sum);
    }

}
