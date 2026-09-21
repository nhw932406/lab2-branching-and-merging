public class DataTypes {
    public static double sum(int[] numbers) {
        int s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
