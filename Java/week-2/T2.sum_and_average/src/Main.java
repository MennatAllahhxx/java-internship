/**
 * The type Main.
 */
public class Main {
    /**
     * Sum int.
     *
     * @param arr the arr
     * @return the sum of the elements in array
     */
    public static int sum(int [] arr) {
        int sum = 0;
        for (int j : arr) sum += j;
        return sum;
    }

    /**
     * Avg float.
     *
     * @param sum    the sum
     * @param length the length
     * @return the float
     */
    public static float avg(int sum, int length)
    {
        float avg = ((float) sum/ (float) length);
        return avg;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{5, 6, 11, 7, 0, 3, 22, 5, 8, 19};

        System.out.println("sum of elements in array = "+ sum(arr));
        System.out.println("average of elements in array = "+ avg(sum(arr), arr.length));
    }
}