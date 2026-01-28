import java.util.Random;

public class ConsoleApp{

    public static void main(String[] args) 
    {
        int size = 10;
        int[] arr = randomArrayGenerator(size);
        // all the work will be shown in here
    }

    public static int[] randomArrayGenerator(int size)
    {
        Random random = new Random();
        // array is being created in the given size
        int[] randomArray = new int[size];

        for(int i = 0; i< size;i++)
        {
            // array is being filled with random numbers from 0 to 100
            randomArray[i] = random.nextInt(101);
        }
        return randomArray;
    }

    public static double averageArray(int[] arr) {
        double sum = 0;
        for (int x : arr) 
        {
            sum += x;
        }
        return sum / arr.length;
    }

    public static void differenceFromAverage(int[] arr) {
        double average = averageArray(arr);
        System.out.print("Differences from average: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print((arr[i] - average) + " ");
        }
        System.out.println();
    }

    /**
     * This function takes an integer array and loops over it by increasing the index 2 at a time to get elements with even indexes starting with index 0.
     * @param arr int[]
     * @return Returns the sum of elemets in an int array with even index.
     */
    public static int sumOfEvenIndexElements(int [] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i = i + 2){
            sum += arr[i];
        }

        return sum;
    }

    /**
     * This function takes an integer array and loops over it by increasing the index 2 at a time to get elements with odd indexes starting with index 1.
     * @param arr int[]
     * @return Returns the sum of elemets in an int array with even index.
     */
    public static int sumOfOddIndexElements(int [] arr) {
        int sum = 0;

        for (int i = 1; i < arr.length; i = i + 2){
            sum += arr[i];
        }

        return sum;
    }

}