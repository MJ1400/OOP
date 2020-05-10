package ee.mj1400.kt;

import java.util.HashMap;

class Word implements WordInterface {
    private final String word;
    Character t2ht;

    public Word(String word) {
        
        this.word = word;
    }

    public HashMap<Character, Integer> charCount(Character t2ht) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            if (c == t2ht) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
            }

        }
        System.out.println("Tähe arv sõnas " + '"' + word + '"');
        charMap.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
        return charMap;
    }

    public String toString(){
        return word;
    }

}
