package com.example.Algoritms4;

public interface StringList {
    String add1(String item);

    String add2(int index, String item);

    String set(int index, String item);

    String remove1(String item);

    String remove2(int index);

    boolean contains(String item);

    int indexOf(String item);

    int lastIndexOf(String item);

    String get(int index);

    boolean equals(StringList otherList);

    int size();

    boolean isEmpty();

    void clear();

    String[] toArray();
    void sort(Integer[] arr);


    void sort2(Integer[] arr);


    void quickSort(Integer[] arr, int begin, int end);


    int partition(Integer[] arr, int begin, int end);


    void swapElements(Integer[] arr, int i1, int i2);


    void grow();


    void printArray();


    void grow2 ();
}
