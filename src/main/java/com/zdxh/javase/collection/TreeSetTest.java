package com.zdxh.javase.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TreeSetTest
 * @Description TreeSet
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/14 16:12
 * @Version 1.0
 **/
public class TreeSetTest {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        set.add(5);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set.remove(5);
        set.contains(2);
        //set.clear();

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Person p1 =new Person(5,"a");
        Person p2 =new Person(2,"b");
        Person p3 =new Person(3,"c");
        Person p4 =new Person(4,"d");

        Set<Person> personSet = new TreeSet<Person>(new Person());
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        for( Person p : personSet){
            System.out.println(p.age +"   ----" + p.name);
        }

    }


}

class Person implements Comparator<Person> {
    int age;
    String name;

    public Person(){

    }

    public Person(int age, String name){
        this.age = age;
        this.name =name;

    }

    public int compare(Person o1, Person o2) {

        if (o1.age < o2.age) {
            return 1;
        }else if(o1.age > o2.age){
            return -1;

        }
        return 0;
    }
}
