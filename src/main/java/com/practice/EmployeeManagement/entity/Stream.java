package com.practice.EmployeeManagement.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
//        Integer arr []= {1,2,1,3,3};
        List<Integer> lst = List.of(1,2,1,3,3);lst.stream().filter(p-> Collections.frequency(lst,p)==1);
    }
}
