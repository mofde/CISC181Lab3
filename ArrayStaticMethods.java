package cisc181.lab_3;
//ArrayStaticMethods consists solely of public static methods useful for operating on arrays.
public class ArrayStaticMethods {
    //sumSqrPos gives the sum of the squares of all the positive values in data.
    public static double sumSqrPos(double[] data) {
        int i;
        double sum = 0.0;
        for (i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                sum = sum + data[i] * data[i];
            }
        }
        return sum;
    }
    //countChars gives the number of elements that match the single character.
    public static int countChars(char[] arrayChars, char searchChar) {
        int count = 0;
        int i;
        for (i = 0; i < arrayChars.length; i++) {
            if (arrayChars[i] == searchChar) {
                count = count + 1;
            }
        }
        return count;
    }
    //replace produces a new array with exactly the same contents as the parameter that takes an
    //integer array and two integer values, except that all occurrences of value1 have been
    //replaced with value2.
    public static int[] replace(int[] values, int value1, int value2) {
        int i;
        for (i = 0; i < values.length; i++) {
            if (values[i] == value1) {
                values[i] = value2;
            }
        }
        return values;
    }
    //moveNegatives gives a new array that contains the exact same numbers as the given array, but
    //arranged so that all the negative values are grouped at the start of the array in the order
    //of the original array and the order of the positive numbers also must be the same as the
    //original array.
    public static int[] moveNegatives(int[] data) {
        int i;
        int countneg = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                countneg = countneg + 1;
            }
        }
        if (countneg == 0){
           return data;
        }
        else {
            int[] finaldata = new int[data.length];
            int j = 0;
            for (i = 0; i < data.length; i++) {
                if (data[i] < 0) {
                    finaldata[j] = data[i];
                    j = j + 1;
                }
                else {
                    finaldata[countneg] = data[i];
                    countneg = countneg + 1;
                }
            }
            return finaldata;
        }
    }
}
