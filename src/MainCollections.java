import java.util.*;

public class MainCollections {

    public static void main(String[] args) {


        listComparison(new ArrayList<String>(), "ArrayList");
        listComparison(new LinkedList<String>(), "LinkedList");
        System.out.println("The results above demonstrate that adding, inserting and deleting for LinkedList work faster," +
                " but setting (method set()) element it the particular place contains a bit more time for LinkedList" + "\n\n");
        setComparison(new HashSet<String>(), "HashSet");
        setComparison(new TreeSet<String>(), "TreeSet");
        System.out.println("Results show us that hashSet gives better performance for the operations like add/remove." +
                " It will be reasonable to use TreeSet If you want a sorted Set or you need to use any additional methods that only TreeSet has" + "\n\n");
        mapComparison(new HashMap<String, String>(), "HashMap");
        mapComparison(new TreeMap<String, String>(), "TreeMap");
        System.out.println("ThreeMap guarantees that the order of the keys is sorted. " +
                "HashMap can be considered more efficient in general methods, so use it whenever you don’t care about the order of the keys." + "\n\n");


    }

    private static void listComparison(List<String> list, String listRealisation) {

        System.out.println("Statistic for " + listRealisation + "\n");
        long beforeCreation = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("String" + i);
        }
        long afterCreation = System.currentTimeMillis();
        System.out.println("Time of filling this collection " + (afterCreation - beforeCreation) + " millis");

        long beforeRemove = System.currentTimeMillis();
        list.remove("String5000");
        list.remove(5000);
        long afterRemove = System.currentTimeMillis();
        System.out.println("Time for delete element " + (afterRemove - beforeRemove) + " millis");
        list.add(99998, "String5000");
        long afterAdd = System.currentTimeMillis();
        System.out.println("Time for add element " + (afterAdd - afterRemove));

        int indexAL = list.indexOf("String50000");
        System.out.println(indexAL);
        long afterIdentity = System.currentTimeMillis();
        System.out.println("Time for identity element " + (afterIdentity - afterAdd) + " millis");
        list.set(6000, "NewElement");
        list.set(7000, "NewElement2");
        list.set(8000, "NewElement3");
        long afterSetElement = System.currentTimeMillis();
        System.out.println("Time for setting element " + (afterSetElement - afterIdentity) + " millis" + "\n\n");
    }


    private static void setComparison(Set<String> set, String setRealisation) {
        System.out.println("Statistic for " + setRealisation + "\n");
        long beforeCreation = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            set.add("String" + ((int) (Math.random() * 1000)));
        }
        long afterCreation = System.currentTimeMillis();
        System.out.println("Time of filling this set " + (afterCreation - beforeCreation) + " millis");

        Set<String> tempSet = new HashSet<>();
        tempSet.add("String100");
        tempSet.add("String200");
        tempSet.add("String300");
        tempSet.add("String400");
        tempSet.add("String500");

        long beforeAddAll = System.currentTimeMillis();
        set.addAll(tempSet);
        long afterAddAll = System.currentTimeMillis();
        System.out.println("Time for add elements " + (afterAddAll - beforeAddAll) + " millis");
        set.removeAll(tempSet);
        long afterdelete = System.currentTimeMillis();
        System.out.println("Time for removing elements " + (afterdelete - afterAddAll) + " millis" + "\n\n");


    }

    private static void mapComparison(Map map, String mapRealisation) {
        System.out.println("Statistic for " + mapRealisation + "\n");

        long beforeCreation = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            map.put(String.valueOf(((int) (Math.random() * 1000))), "String" + i);
        }
        long afterCreation = System.currentTimeMillis();
        System.out.println("Time of filling this map " + (afterCreation - beforeCreation) + " millis");

        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("500", "newElement1");
        tempMap.put("600", "newElement1");
        tempMap.put("700", "newElement1");
        tempMap.put("800", "newElement1");
        tempMap.put("900", "newElement1");

        long beforePutAll = System.currentTimeMillis();
        map.putAll(tempMap);
        long afterPutAll = System.currentTimeMillis();
        System.out.println("Time of putting elements " + (afterPutAll - beforePutAll) + " millis");
        // System.out.println(map);
        map.get("500");
        map.get("600");
        map.get("700");
        map.get("800");
        map.get("900");
        long afterGetAll = System.currentTimeMillis();
        System.out.println("Time foe getting elements " + (afterGetAll - afterPutAll) + " millis");
        map.remove("500", "newElement1");
        map.remove("600", "newElement1");
        map.remove("700", "newElement1");
        map.remove("800", "newElement1");
        map.remove("900", "newElement1");
        long aftertRemoveElements = System.currentTimeMillis();
        System.out.println("Time for delete elements " + (aftertRemoveElements - afterGetAll) + " millis" + "\n\n");


    }

}
