package com.galaxy.venus.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>(Arrays.asList(new String[]{"123","234","345"}));
        String tempStr = studentList.parallelStream().collect(Collectors.joining("|","[","]"));
        System.out.println(tempStr);

    }
}
