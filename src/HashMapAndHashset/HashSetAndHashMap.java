package HashMapAndHashset;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSetAndHashMap {
    public static void main(String[] args) {
      HashMap<Integer,Integer> hashMap=new HashMap<>();
      hashMap.put(1,6);
      hashMap.put(1,5);
      System.out.println(hashMap.get(1)); //5

        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(1,3);
        map.put(4,33);
        map.put(2,6);
        map.put(1,7);
        System.out.println(map.values());
    }


}
