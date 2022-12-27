package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] arr = sentence.split("[ .,]");
        Map<String, Integer> map = new HashMap<>();
        if (arr.length > 1) {
            for (String s : arr) {
                if (!s.isBlank()) {

                    String key = s.toLowerCase();

                    int n = 1;
                    if (map.containsKey(key)) {
                        n = map.get(key) + 1;
                    }

                    map.put(key, n);
                }

            }
        }
        return map;
    }
}
