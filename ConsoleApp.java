import java.util.Random;
import java.util.Scanner;

public class ConsoleApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = 10;
        int[] arr = randomArrayGenerator(size);
        // all the work will be shown in here

        boolean canContinue = true;
        while (canContinue) {
            displayMenu();
            int decision = inputValidifier("Please select an operation (1-4): ");

            switch (decision) {
                case 1:
                    // TODO: call the minimum and maximum method and properly display
                    System.out.println("Minimum value: " + findMin(arr));
                    System.out.println("Maximum value: " + findMax(arr));
                    break;
                case 2:
                    differenceFromAverage(arr);
                    break;
                case 3:
                    System.out.printf(
                            "Sum of elements with odd numbered indexes: %d\nSum of elements with even numbered indexes: %d\n",
                            sumOfOddIndexElements(arr), sumOfEvenIndexElements(arr));
                    break;
                case 4:
                    System.out.println("Program ended.");
                    canContinue = false;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("""
                \n=====[!] MENU [!]=====
                1) Find and display the minimum and maximum values in the array
                2) Find the average and display how each element of the array differs from the average
                3) Find and display the sum of elements with odd- and even-numbered indexes
                4) EXIT
                ======================""");
    }

    public static int inputValidifier(String prompt) {
        boolean isValid = false;
        int result = -1; // to get things started

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input >= 1 && input <= 4) {
                    result = input;
                    isValid = true;
                }
            } else {
                System.out.println("Invalid input, try again!");
            }
            sc.nextLine();
        }
        return result;
    }

    public static int[] randomArrayGenerator(int size) {
        Random random = new Random();
        // array is being created in the given size
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            // array is being filled with random numbers from 0 to 100
            randomArray[i] = random.nextInt(101);
        }
        return randomArray;
    }

    public static double averageArray(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

    public static void differenceFromAverage(int[] arr) {
        double average = averageArray(arr);
        System.out.print("Differences from average: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] - average) + " ");
        }
        System.out.println();
    }

    /**
     * This function takes an integer array and loops over it by increasing the
     * index 2 at a time to get elements with even indexes starting with index 0.
     * 
     * @param arr int[]
     * @return Returns the sum of elements in an int array with even index.
     */
    public static int sumOfEvenIndexElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i = i + 2) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * This function takes an integer array and loops over it by increasing the
     * index 2 at a time to get elements with odd indexes starting with index 1.
     * 
     * @param arr int[]
     * @return Returns the sum of elements in an int array with odd index.
     */
    public static int sumOfOddIndexElements(int[] arr) {
        int sum = 0;

        for (int i = 1; i < arr.length; i = i + 2) {
            sum += arr[i];
        }

        return sum;
    }

    // findMin fuction finds and returns the smallest value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // findMax fuction finds and returns the largest value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}