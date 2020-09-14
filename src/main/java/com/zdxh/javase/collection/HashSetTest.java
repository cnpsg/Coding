package com.zdxh.javase.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName HashSetTest
 * @Description HashSet的说明
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/14 15:59
 * @Version 1.0
 **/
public class HashSetTest {

    //HashSet由hash算法
    // Collection接口 <--- set接口 <---HashSet接口

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add("a");
        System.out.println(hashSet);

        hashSet.remove(1);
        System.out.println(hashSet);

        System.out.println(hashSet.contains(1));

        hashSet.clear();
        System.out.println(hashSet);

        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add(null);
        hashSet.add("A");//set集合是存的值是不重复的
        System.out.println(hashSet);//不能保存的元素的顺序

        Iterator it = hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Object obj:hashSet
             ) {
            System.out.println(obj);
        }
        System.out.println(hashSet.size());

        //使用泛型
        Set<String> set = new HashSet<String>();//指定泛型
        set.add("eee");
        //set.add(11);


    }





}
