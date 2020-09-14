package com.zdxh.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description list
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/14 16:28
 * @Version 1.0
 **/
public class ListTest {
    public static void main(String[] args) {
        //
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        System.out.println(list);
        System.out.println(list.get(2));

        list.add(2,"ee");
        System.out.println(list);

        List<String> l = new ArrayList<String>();
        l.add("123");
        l.add("456");
        list.addAll(2,l);
        System.out.println(list);
        System.out.println(list.indexOf("123"));
        System.out.println(list.lastIndexOf("d"));

        list.remove(2);
        System.out.println(list);
        list.set(2,"ddddddd");
        System.out.println(list);

       List<String> subList = list.subList(2,4);
        System.out.println(subList);
        System.out.println(subList.size());

    }
}
