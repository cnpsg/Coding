package com.zdxh.javase.collection;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest
 * @Description map
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/14 16:39
 * @Version 1.0
 **/
public class MapTest
{
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("b",2);
        map.put("a",1);
        map.put("c",2);
        map.put("e",3);
        System.out.println(map);

        System.out.println(map.get("e"));
        map.remove("e");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("e"));
        System.out.println(map.containsValue(1));
        //遍历
        map.keySet();//获取key
        map.values();//获取valuse

        Set<String> keys = map.keySet();

        for(String key:keys){
            System.out.println(key + map.get(key));
        }
        Set<Map.Entry<String ,Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> en : entries){
            System.out.println(en.getKey()+"----"+en.getValue());
        }

        //TreeMap的自燃排序
        Map<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(4,"a");
        treeMap.put(3,"b");
        treeMap.put(5,"c");
        treeMap.put(6,"d");
        System.out.println(
                treeMap
        );

        Map<String,String> treeMap2 = new TreeMap<String, String>();

        treeMap2.put("a","a");
        treeMap2.put("b","b");
        treeMap2.put("e","c");
        treeMap2.put("d","d");
        System.out.println(treeMap2);


    }
}
