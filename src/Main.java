import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algo algo = new Algo(1);
        algo.insert(100);
        algo.insert(40);
        algo.insert(70);
        algo.insert(50);
        algo.print();
        System.out.println("-----------------");
        System.out.println(Arrays.toString(algo.bubbleSortAsc()));
        System.out.println(algo.closestToZero());
        System.out.println(algo.closestTo(75));
        System.out.println("-------------------");
        System.out.println(algo.min());
        System.out.println(algo.max());
    }
}
