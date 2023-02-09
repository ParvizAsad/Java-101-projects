public class FindMaxAndMin {

    public static void main(String[] args) {

        int length = Util.intInput("Neçə ədəd daxil edəcəksiniz?");
        double[] intArr = new double[length];
        double temp;
        for (int i = 0; i < length; i++) {
            temp = Util.intInput((i + 1) + " -ci ədədi daxil edin:");
            intArr[i] = temp;
        }
        System.out.println("Max: " + maxValue(intArr));
        System.out.println("Min: " + minValue(intArr));
    }

     static double maxValue(double[] numbers) {
         double maximum = numbers[0];
        for (double number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

     static double minValue(double[] numbers) {
         double minimum = numbers[0];
        for (double number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

}
