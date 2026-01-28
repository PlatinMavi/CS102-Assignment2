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

}