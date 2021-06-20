import javafx.geometry.BoundingBox;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        String[] data_str = {"1", "China", "Canada"};
//        LinearSearch ls = new LinearSearch();
//        在class LinearSearch中的main函数仍然可以调用它的构造函数
//        但在class Main中不能调用，因为LinearSearch的构造函数为私有
        int res1 = LinearSearch.search(data, 16);
        System.out.println(res1);

        int res2 = LinearSearch.search(data, 166);
        System.out.println(res2);

        int res3 = LinearSearch.search(data_str, "1");
        System.out.println(res3);

        Student[] students = {new Student("Alice"),
                              new Student("Jiaqi"),
                              new Student("Bobo")};
        Student student = new Student("Xiaoming");

        int res4 = LinearSearch.search(students, student);
        System.out.println(res4);


    }
}
