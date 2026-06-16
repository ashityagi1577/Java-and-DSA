import java.util.*;

class HashMapFrequency {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(1,1,1,1,1,5,6,2,4,4,2,3,5,6,7,8,9,1,4,5));

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i : list1) {

            if (freqMap.containsKey(i)) {
                int freqOfKey = freqMap.get(i);
                freqMap.put(i, freqOfKey + 1);
            } else {
                freqMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : freqMap.entrySet()) {
            System.out.println("The key is " + map.getKey()
                    + " and the value is " + map.getValue());
        }
    }
}

