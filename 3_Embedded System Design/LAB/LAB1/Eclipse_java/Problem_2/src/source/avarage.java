package source;
import java.util.Scanner;
public class avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        sumAndAverage(numbers);
	}



    static void sumAndAverage(int[] numbers) {
        int sumEven = 0, sumOdd = 0;
        int countEven = 0, countOdd = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sumEven += num;
                countEven++;
            } else {
                sumOdd += num;
                countOdd++;
            }
        }

        double avgEven = countEven > 0 ? (double) sumEven / countEven : 0;
        double avgOdd = countOdd > 0 ? (double) sumOdd / countOdd : 0;

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Average of even numbers: " + avgEven);

        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Average of odd numbers: " + avgOdd);
    }
}
