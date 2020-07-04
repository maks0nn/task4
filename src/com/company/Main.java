package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){
        test3();
    }

    public static void test1(){
        Integer data[] = new Integer[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        Arrays.sort(data);

        int item = 1234;

        System.out.println(MyBinarySearch.indexOf(data, item));
    }

    public static void test2(){
       List<String> data = new ArrayList<>();

       Collections.sort(data);
       data.add("Alice");
       data.add("Bobby");
       data.add("Bowie");
       data.add("David");
       String item = "Alice";


        System.out.println(MyBinarySearch.indexOf(data, item));
    }

    public static void test3(){
        List<GoodStuff> data = new ArrayList<>();



        GoodStuff stuff1 = new GoodStuff("Fuga", 1000);
        data.add(stuff1);
        GoodStuff stuff2 = new GoodStuff("Fuga", 200);
        data.add(stuff2);
        GoodStuff stuff3 = new GoodStuff("Fuga", 300);
        data.add(stuff3);
        Collections.sort(data);
        GoodStuff item = new GoodStuff("Fuga", 300);


        System.out.println(MyBinarySearch.indexOf(data, item));
    }
}
