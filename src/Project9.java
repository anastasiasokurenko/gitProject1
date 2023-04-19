import java.util.Arrays;

public class Project9 {
    //Write a java program to find the second largest
    //number in the array?
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6, 2};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number in the array is " + secondLargest);
    }

}
