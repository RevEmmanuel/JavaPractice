package chapter16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
        return new HashSet<>(set1);
    }

    public static Set<String> interaction(Set<String> set1, Set<String> set2) {
        Set<String> sameValues = new HashSet<String>();
        for (String value : set1) {
            if (set2.contains(value)) sameValues.add(value);
        }
        return sameValues;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> differentValues = new HashSet<String>();
        for (String value : set1) {
            if (!set2.contains(value)) differentValues.add(value);
        }
        for (String value : set2) {
            if (!set1.contains(value)) differentValues.add(value);
        }
        return differentValues;
    }
}
