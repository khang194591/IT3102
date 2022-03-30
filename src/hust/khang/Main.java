package hust.khang;

public class Main {

    public static void main(String[] args) {
        System.out.println("Trịnh Đức Khang - 20194591");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        float avg = (float) sum / array.length;
        System.out.printf("Sum = %d\nAvg = %.2f", sum, avg);
    }
}
