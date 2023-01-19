package chapter16.comparatorsPackage;

import Chapter8.FirstTimeClass;

import java.util.Comparator;

public class FirstTimeComparator implements Comparator<FirstTimeClass> {


    @Override
    public int compare(FirstTimeClass time1, FirstTimeClass time2) {
        int hourDifference = time1.getHour() - time2.getHour();
        if (hourDifference != 0) return hourDifference;

        int minuteDifference = time1.getMinute() - time2.getMinute();
        if (minuteDifference != 0) return minuteDifference;

        return time1.getSecond() - time2.getSecond();
    }
}
