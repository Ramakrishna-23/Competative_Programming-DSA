package org.example;
import java.util.*;
// sort an array using recursion

public class SortArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,1,4,5,6,7));
        System.out.println(sort(list));
    }

    public static List<Integer> sort(List<Integer> list) {
        if (list.size() == 1) {
            return list;
        }
        int temp = list.remove(list.size() - 1);
        sort(list);
        insert(list, temp);
        return list;
    }

    public static List<Integer> insert(List<Integer> list, int temp) {
        if (list.isEmpty() || list.get(list.size() - 1) <= temp) {
            list.add(list.size(), temp);
            return list;
        }
        int value = list.remove(list.size() - 1);
        insert(list, temp);
        list.add(list.size(), value);
        return list;
    }
}