package com.epam.mjc.collections.list;

import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (func(Integer.parseInt(a)) > func(Integer.parseInt(b))) {
            return 1;
        } else if (func(Integer.parseInt(a)) < func(Integer.parseInt(b)))
            return -1;
        else {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
        //return Integer.compare(func(Integer.parseInt(a)), func(Integer.parseInt(b)));

}

public int func(int x) {
    return 5 * x * x + 3;
}
}
