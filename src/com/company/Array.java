package com.company;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
        count = 0;
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[items.length * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    // removing at a certain index
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Please provide a valid index!");

        int[] removeItem = new int[count];

        for (int i = 0; i < count; i++) {
            if (index >= i)
                removeItem[i] = items[i + 1];

            removeItem[i] = items[i];
        }

        items = removeItem;
        count--;
    }

    public void remove() {
        count--;
    }

    public void insertAt(int index, int value) {
        int[] newEntry = new int[count + 1];

        if (index < 0 || index >= count)
            throw new ArrayIndexOutOfBoundsException("Provide a valid index!");

        if (index != 0)
            newEntry[index - 1] = items[index - 1];

        for (int i = index; i < count; i++)
            newEntry[i + 1] = items[i];

        newEntry[index] = value;
        items = newEntry;
        count++;
    }

    public int max() {
        int largestNumber = items[0];

        for (int number : items) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        return largestNumber;
    }

//    public int[] intersect(int[] anotherArray) {
//        int itemsLength = items.length;
//        int anotherLength = anotherArray.length;
//        int[] commonNumbers;
//
//        if (itemsLength > anotherLength) {
//            commonNumbers = new int[anotherLength];
//            for (int item : items) {
//                for (int anotherItem : anotherArray) {
//                    if (item == anotherItem) {
//
//                    }
//                }
//            }
//        }
//    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
