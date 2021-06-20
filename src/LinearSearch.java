public class LinearSearch<E> {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        // 泛型只能储存类，不能储存基本数据类型

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] dataSize = {1000000, 10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generatorOrderedArray(n);

            long start_time = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data, n);
            }
            long end_time = System.nanoTime();
            double time = (end_time - start_time) / 1000000000.0;
            System.out.println("n=" + n + " 100Runs:" + time + " s");
        }


    }
}
