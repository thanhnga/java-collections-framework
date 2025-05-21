package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        // Mảng số nguyên mẫu
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Tạo ConcurrentHashMap để lưu trữ kết quả
        ConcurrentHashMap<String, Integer> resultMap = new ConcurrentHashMap<>();

        // Số lượng thread 2, một thread sẽ tính tổng từ 1-5 và thread còn lại từ 6-10
        int numThreads = 2;

        // Tính số phần tử của mỗi phần
        int chunkSize = numbers.length / numThreads;

        // Tạo và start các thread tính tổng
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numThreads - 1) ? numbers.length : (i + 1) * chunkSize;
            threads[i] = new Thread(new SumTask(numbers, startIndex, endIndex, resultMap));
            threads[i].start();
        }

        // Đợi cho tất cả các thread tính tổng kết thúc
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Tính tổng kết quả từ các thread
        int totalSum = 0;
        for (int sum : resultMap.values()) {
            totalSum += sum;
        }

        System.out.println("Total sum: " + totalSum);
    }

}
