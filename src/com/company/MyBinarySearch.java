package com.company;

import java.util.List;

public class MyBinarySearch<T extends Comparable<? super T>> {

    private T data[];
    private T value;

    // возвращает индекс элемента в массиве со значением value
    // или -1, если такого нет

    public static <T extends Comparable<? super T>> int indexOf(T[] data, T value) {
        int position;
        int positionOfFirstElement = 0;
        int positionOfLastElement = data.length -1;

        position = (positionOfFirstElement + positionOfLastElement) / 2;

        while ((data[position] != value) && (positionOfFirstElement <= positionOfLastElement)) {
            if (data[position].compareTo(value) > 0) {
                positionOfLastElement = position - 1;
            } else {
                positionOfFirstElement = position + 1;
            }
            position = (positionOfFirstElement + positionOfLastElement) / 2;
        }
        if (positionOfFirstElement <= positionOfLastElement) {
           return position;
        } else {
           return -1;
        }
    }

// возвращает наименьший индекс элемента, строго большего value
// или -1, если такого нет
    public static <T extends Comparable<? super T>> int indexOfHigher(T[] data, T value) {
        int position = indexOf(data, value);
        if (position == -1 || position == data.length - 1) {
            return -1;
        } else {
            return position+1;
        }
    }

// возвращает наибольший индекс элемента, строго меньшего value
// или -1, если такого нет
    public static <T extends Comparable<? super T>> int indexOfLower(T[] data, T value) {
        int position = indexOf(data, value);
        if (position == -1 || position == 0) {
            return -1;
        } else {
            return position-1;
        }
    }

// и такие же методы для списков (по сути копия кода
// с разницей только в способе обращения к элементам)
    public static <T extends Comparable<? super T>> int indexOf(List<T> data, T value) {
        int position;
        int positionOfFirstElement = 0;
        int positionOfLastElement = data.size() -1;

        position = (positionOfFirstElement + positionOfLastElement) / 2;
        while (!(data.get(position).compareTo(value) == 0) && (positionOfFirstElement <= positionOfLastElement)) {
            if (data.get(position).compareTo(value) > 0) {
                positionOfLastElement = position - 1;
            } else {
                positionOfFirstElement = position + 1;
            }
            position = (positionOfFirstElement + positionOfLastElement) / 2;
        }
        if (positionOfFirstElement <= positionOfLastElement) {
            return position;
        } else {
            return -1;
        }
    }


    public static <T extends Comparable<? super T>> int indexOfHigher(List<T> data, T value) {
        int position = indexOf(data, value);
        if (position == -1 || position == data.size() - 1) {
            return -1;
        } else {
            return position+1;
        }
    }

    public static <T extends Comparable<? super T>> int indexOfLower(List< T> data, T value) {
        int position = indexOf(data, value);
        if (position == -1 || position == 0) {
            return -1;
        } else {
            return position-1;
        }
    }
}
