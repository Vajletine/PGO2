public class Main {

    public static int[] filterEvenIndexOddValue(int[] array) {
        // zliczyc
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                count++;


                int[] result = new int[array.length];

                for (int n = 0; i < array.length; i++) {
                    if (i % 2 == 0) {
                        if (array[i] % 2 == 1) {
                            result[i] = array[i];
                        }
                    }


                }

                return result;


            }

        }
        return array;

    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 10, 11};

        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(array1))); // [1, 5]
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(array2))); // []
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(array3))); // [7, 9, 11]


    }
}
