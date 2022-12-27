package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry: sourceMap.entrySet())
        {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (newMap.containsKey(value)) {
                Integer key2 = newMap.get(value);
                if (key2 > key) {
                    newMap.put(value, key);
                }
                else newMap.put(value, key2);

            }
            else {
                newMap.put(value, key);
            }

        }



        return newMap;
    }
}
