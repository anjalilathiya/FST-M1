package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 20, 10, 9, 6, 7};
        System.out.println("Input Array was: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\n Sorted Array is ");
        for (int i = 0; i<numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}