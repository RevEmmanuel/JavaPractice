package chapter16.comparatorsPackage;

import Chapter8.FirstTimeClass;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<FirstTimeClass> timeList = new ArrayList<>();

        timeList.add(new FirstTimeClass(6, 24, 34));
        timeList.add(new FirstTimeClass(18, 14, 58));
        timeList.add(new FirstTimeClass(6, 5, 34));
        timeList.add(new FirstTimeClass(12, 14, 58));
        timeList.add(new FirstTimeClass(6, 24, 22));

        System.out.printf("List before sorting: %s%n", timeList);
//        Collections.sort(timeList, new FirstTimeComparator());
        timeList.sort(new FirstTimeComparator());
        System.out.printf("%nList after sorting: %s", timeList);
    }
}
