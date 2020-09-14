package com.zdxh.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsTest
 * @Description Collections
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/14 16:52
 * @Version 1.0
 **/
public class CollectionsTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("b");
        list.add("e");
        list.add("g");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
