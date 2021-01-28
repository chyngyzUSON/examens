import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        HashSet<Integer> myHashSet = new HashSet<>();

        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                myHashSet.add(i);
            }
        }
        System.out.println(myHashSet);

    }
}
