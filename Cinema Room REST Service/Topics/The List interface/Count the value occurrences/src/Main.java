import java.util.Collections;
import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        /**
        int count1 = 0;
        int count2 = 0;

        for (Integer i :
                list1) {
            if (i == elem) count1++;
        }

        for (Integer i :
                list2) {
            if (i == elem) count2++;
        }

        return (count1 == count2);
        */      // Method number 1

        return Collections
                .frequency(list1, elem)
                    == Collections
                        .frequency(list2, elem); // Method number 2

        /**
        return list1
                .stream()
                    .filter(num -> num.equals(elem))
                        .count()
                == list2
                    .stream()
                        .filter(num -> num.equals(elem))
                            .count();
        */
          // Method number 3
    }
}