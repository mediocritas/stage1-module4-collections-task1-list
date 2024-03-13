package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newSourceList = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            //newSourceList.add(0);
            if (sourceList.get(i) % 2 == 0) {
                newSourceList.addLast(sourceList.get(i));
            } else {
                newSourceList.addFirst(sourceList.get(i));
            }

        }
        return newSourceList;
    }
}
