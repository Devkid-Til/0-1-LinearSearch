public class ArrayGenerator {
    private ArrayGenerator() { }

    static public Integer[] generatorOrderedArray(int n) {

        Integer []  arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;

    }

    static public Integer[] ShuffleArray(Integer[] arr) {

        return arr;
    }

}
