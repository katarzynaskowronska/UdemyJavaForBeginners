package pl.katarzynaskowronska.learning.collections;

import java.util.*;
import java.util.stream.IntStream;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("axc");
        list.add("tekst");
        list.add("tekst");
        list.add("abc");
        System.out.println(list);

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.addAll(list); ///w secie elementy sie nie powtarzaja, nie mamy tez pewnosci jak zostana posortowane
        treeSet.addAll(list); // sortuje alfabetycznie
        System.out.println(hashSet);
        System.out.println(treeSet);

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("pierwszy", "first");
        hashMap.put("drugi", "second");
        treeMap.putAll(hashMap);

        for(String str : hashMap.values()){

        }
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String :: toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(0,10)
                .forEach(System.out::println);






    }
}
